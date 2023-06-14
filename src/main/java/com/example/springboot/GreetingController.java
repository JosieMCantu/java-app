package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {
    @Autowired
    private GreetingRepository greetingRepository;

    @PostMapping(path="/greeting")
    public String greetingSubmit(@RequestParam String id, @RequestParam String content) {
        Greeting n = new Greeting();
        n.setId(Long.valueOf(id));
        n.setContent(content);
        greetingRepository.save(n);
        return "result";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }
}