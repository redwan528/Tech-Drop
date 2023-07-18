package com.TechDrop.TechDrop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TechController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/tech-reigster")
    public String techRegister(){
        return "techRegister";
    }
}
