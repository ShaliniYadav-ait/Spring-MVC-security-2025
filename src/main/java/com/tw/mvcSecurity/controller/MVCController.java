package com.tw.mvcSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCController {

    @GetMapping("/")
    public String showHome() {
        return "home";
    }

}
