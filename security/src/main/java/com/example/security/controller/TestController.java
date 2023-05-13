package com.example.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/config")
    public String config() {
        return "config";
    }

    @GetMapping("/messages")
    public String messages() {
        return "messages";
    }

    @GetMapping("/mypage")
    public String mypage() {
        return "mypage";
    }
}
