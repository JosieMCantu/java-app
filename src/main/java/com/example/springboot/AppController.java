package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {
    @Autowired

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/process")
    public String process() {
        return "process";
    }
}