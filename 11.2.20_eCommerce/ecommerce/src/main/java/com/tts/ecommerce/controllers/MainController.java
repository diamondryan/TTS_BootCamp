package com.tts.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ControllerAdvice

public class MainController {
    
    

    @GetMapping("/")
    public String main() {
        return "main";
    }


}
