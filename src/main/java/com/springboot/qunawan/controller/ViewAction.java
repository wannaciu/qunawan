package com.springboot.qunawan.controller;

import com.springboot.qunawan.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class ViewAction {
    @RequestMapping("/password")
    public String passwordview(HttpServletRequest request, Model model){
        HttpSession session =request.getSession();
        User user= (User) session.getAttribute("user");
        System.out.println(user);
        if(user==null)
            return "redirect:/";
        model.addAttribute("user",user);
        return "password";
    }
    @RequestMapping("/main")
    public String mainview(HttpServletRequest request, Model model){
        HttpSession session =request.getSession();
        User user= (User) session.getAttribute("user");
        System.out.println(user);
        if(user==null)
            return "redirect:/";
        model.addAttribute("user",user);
        return "main";
    }
    @RequestMapping("/info")
    public String infoview(HttpServletRequest request, Model model){
        HttpSession session =request.getSession();
        User user= (User) session.getAttribute("user");
        System.out.println(user);
        if(user==null)
            return "redirect:/";
        if(user.getImg_path().equals(""))
            user.setImg_path(null);
        model.addAttribute("user",user);
        return "info";
    }
    @RequestMapping("/logout.action")
    public String logout (HttpServletRequest request, Model model){
        HttpSession session =request.getSession();
        session.setAttribute("user",null);
        return "redirect:/";
    }


}
