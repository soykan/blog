package com.soykan.blog;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class LoginController {
    
    @GetMapping("/api/login")
    public String login() {
        return "login";
    }
    
}
