package com.soykan.blog;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
    
    @PostMapping("/api/login")
    public String login(@RequestBody UserDto userDto) {
        if (userDto.getUsername().equals("admin") && userDto.getPassword().equals("password")) {
            return "Credentials correct";
        } else {
            return "Credentials incorrect";
        }
    }
    
}
