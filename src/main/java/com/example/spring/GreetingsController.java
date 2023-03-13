package com.example.spring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    String name = "";

    @GetMapping("/de")
    public String getGreetingsDe(){
        return "Hallo ";
    }   //localhost:8080/helloworld/de

    @GetMapping("/en")
    public String getGreetingsEn() {
        return "Hello ";
    }   //localhost:8080/helloworld/en

    @GetMapping("/{name}")
    public String getGreetings(@PathVariable String name, @RequestParam String greeting) { // localhost:8080/greetings/Robin?greeting=Hallo
        return greeting + " " + name;
    }

    @PostMapping
    public void addName(@RequestBody String newName) {
        name = newName;

    }



}

