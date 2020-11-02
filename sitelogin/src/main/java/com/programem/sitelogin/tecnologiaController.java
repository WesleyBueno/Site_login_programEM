package com.programem.sitelogin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class tecnologiaController {
    
    @GetMapping("/tecnologia")
    public String tecnologia() {
        return "tecnologia";
    }
}