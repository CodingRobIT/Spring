package com.example.spring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    String name = "";

    @GetMapping("/de")
    public String getGreetingsDe(){
        return "Hallo ";
    }

    @GetMapping("/en")
    public String getGreetingsEn() {
        return "Hello ";
    }

    @GetMapping("/{name}")
    public String getGreetings(@PathVariable String name, @RequestParam String greeting) {
        return greeting + " " + name;
    }

    @PostMapping
    public void addName(@RequestBody String newName) {
        name = newName;

    }
    @GetMapping
    public String getName(@RequestBody String vorname) {
        return name = vorname;
    }




}

