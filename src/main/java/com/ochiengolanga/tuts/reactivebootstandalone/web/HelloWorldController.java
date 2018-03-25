package com.ochiengolanga.tuts.reactivebootstandalone.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class HelloWorldController {

    @GetMapping
    public String greetings() {
        return "Hello world";
    }
}
