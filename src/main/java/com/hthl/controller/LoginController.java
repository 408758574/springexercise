package com.hthl.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hthl.pojo.User;

@Controller
public class LoginController {
    
    @RequestMapping("/login")
    public Model login(@RequestParam String name,@RequestParam String password,Model model){
        User user = new User();
        model.addAttribute(user);
        return model;
    }
}
