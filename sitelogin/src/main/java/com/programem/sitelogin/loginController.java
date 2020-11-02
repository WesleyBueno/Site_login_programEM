package com.programem.sitelogin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class loginController {
    

    @PostMapping("/login")
    public String loginpost(){
        return "login";
    }
    @GetMapping ("/login")
    public String login(){
        return "login";
    }
}