package com.AndrewPatrick.Quan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String hello() {
        return "welcome.html";
    }

}