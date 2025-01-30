package com.example.securityexample;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GreetingCotroller {

    @GetMapping("/hello")
    public String greetings() {
        return "Hello World";
    }
}
