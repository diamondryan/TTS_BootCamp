package com.tts.exampleapi.controller;

import com.tts.exampleapi.model.Message;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public Message greeting(
             @RequestParam(value="name", defaultValue="Tom") String name) {
        String greeting = "Hello";

        Message m = new Message(4, greeting, name);
        return m;
    }

    // @RequestMapping("/beauty")
    // public Beauty favBeauty(@RequestParam(value = "lashes") String lashes,
    //     @RequestParam(value = "skincare") String skincare,
    //     @RequestParam(value = "makeup") String makeup) {
        
    //     Beauty beauty = new Beauty(lashes, skincare, makeup);
    //     return beauty;
    // }


}