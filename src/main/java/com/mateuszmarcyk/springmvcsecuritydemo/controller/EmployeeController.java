package com.mateuszmarcyk.springmvcsecuritydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login-form";
    }

    @GetMapping("/leaders")
    public String showLeadersPage() {
        return "leaders";
    }

    @GetMapping("/admin")
    public String showAdminPage() {
        return "admin";
    }

    @GetMapping("/access-denied")
    public String showAccessDenied() {
        return "access-denied";
    }
}
