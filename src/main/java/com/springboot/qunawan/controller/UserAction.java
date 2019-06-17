package com.springboot.qunawan.controller;

import com.springboot.qunawan.pojo.User;
import com.springboot.qunawan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request) {
        String username = user.getUsername();
        String password = user.getPassword();

        System.out.println(username + " -- " + password);
        if(userService.login(user)) {
            HttpSession session =request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            return "welcome";
        }
        return "redirect:/login.html";
    }
}
