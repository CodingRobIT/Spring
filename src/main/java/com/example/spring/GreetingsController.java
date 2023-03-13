package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @GetMapping("/de")
    public String getGreetingsDe(){
        return "Hallo";
    }

    @GetMapping("/en")
    public String getGreetingsEn() {
        return "Hello";
    }

}

