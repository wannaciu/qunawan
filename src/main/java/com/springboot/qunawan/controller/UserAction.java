package com.springboot.qunawan.controller;

import com.springboot.qunawan.pojo.User;
import com.springboot.qunawan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request, Model model) {
        String username = user.getName();
        String password = user.getPassword();
        password=MD5(password);
        System.out.println(password);
        System.out.println(username + " -- " + password);
        User u=userService.login(user);
        if(u!=null) {
            HttpSession session =request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            model.addAttribute("user",u);
            return "welcome";
        }
        return "login";
    }

    @RequestMapping("/sign")
    public String sign(User user, HttpServletRequest request, Model model) {
        user.setPassword(MD5(user.getPassword()));
        userService.sign(user);
        return "login";
    }

    @RequestMapping("/check_phone")
    @ResponseBody
    public String check_phone(User user) {
        if(userService.checkPhone(user.getPhone()))
        {
            return "false";
        }
        return "true";
    }
    @RequestMapping("/check_email")
    @ResponseBody
    public String check_email(User user) {
        if(userService.checkPhone(user.getEmail()))
        {
            return "false";
        }
        return "true";
    }

    //生成md5方法
    private static String MD5(String sourceStr) {
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sourceStr.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            result = buf.toString();
            System.out.println("MD5(" + sourceStr + ",32) = " + result);
            System.out.println("MD5(" + sourceStr + ",16) = " + buf.toString().substring(8, 24));
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
        return result;
    }

}
