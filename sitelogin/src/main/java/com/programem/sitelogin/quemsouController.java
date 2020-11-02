package com.programem.sitelogin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class quemsouController {
    
    @GetMapping("/quemsou")
    public String quemsou(){
        return "quemsou";
    }
}