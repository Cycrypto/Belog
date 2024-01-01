
package com.belog.myblog.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BelogController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog/blogMain";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login/loginMain";
    }

    @PostMapping("/login")
    public String handleLogin() {
        return "redirect:/";
    }

    @GetMapping("/register")
    public String showRegisterForm() {
        return "login/registerMain";
    }

    @PostMapping("/register")
    public String handleRegister() {
        return "redirect:/";
    }

}