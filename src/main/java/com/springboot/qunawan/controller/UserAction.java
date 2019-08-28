package com.springboot.qunawan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.qunawan.pojo.User;
import com.springboot.qunawan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request, Model model) {
        if (user.getName()==null)
            return "redirect:/";
        String username = user.getName();
        String password = user.getPassword();
        password=MD5(password);
        user.setPassword(password);
        System.out.println(password);
        System.out.println(username + " -- " + password);
        User u=userService.login(user);
        if(u!=null) {
            HttpSession session =request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            session.setAttribute("user",u);
            model.addAttribute("user",u);
            return "main";
        }
        model.addAttribute("msg","登录失败,账号/密码错误");
        return "login";
    }

    @RequestMapping("/sign")
    public String sign(User user, HttpServletRequest request, Model model) {
        user.setPassword(MD5(user.getPassword()));
        userService.sign(user);
        model.addAttribute("msg","注册成功");
        return "login";
    }

//    @RequestMapping("/modify")
//    public String modify(User user, HttpServletRequest request, Model model) {
//        HttpSession session =request.getSession();
//        User u= (User) session.getAttribute("user");
//        user.setId(u.getId());
//        user.setPhone(u.getPhone());
//        int id=u.getId();
//        userService.update(user);
////        userService.sign(user);
////        model.addAttribute("msg","注册成功");
//        return "login";
//    }

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

    @RequestMapping("/alterpassword.action")
    @ResponseBody
    public int alter_password(String psw1,String psw2,HttpServletRequest request)
    {
        HttpSession session =request.getSession();
        User user= (User) session.getAttribute("user");
        psw1=MD5(psw1);
        if(psw1.equals(user.getPassword()))
        {
            user.setPassword(MD5(psw2));
            session.setAttribute("user",user);
            userService.updatepsw(user);
            return 1;
        }
        return 2;

    }
    @RequestMapping("/alteruser.action")
    @ResponseBody
    public int alter_user(HttpServletRequest request,User user)
    {
        String path=user.getImg_path();
        String[] a=path.split("\\\\");
        String[] b=a[a.length-1].split("/");
        HttpSession session =request.getSession();
        User u= (User) session.getAttribute("user");
        u.setEmail(user.getEmail());
        u.setName(user.getName());
        u.setSex(user.getSex());
        u.setImg_path(b[b.length-1]);
        session.setAttribute("user",u);
        return userService.updateuser(u);
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
