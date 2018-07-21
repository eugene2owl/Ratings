package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("user", userService.getUserById(1));
        return "index";
    }
}
