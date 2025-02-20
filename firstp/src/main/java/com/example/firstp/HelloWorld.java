package com.example.firstp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/helloworld")
public class HelloWorld {
    
    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }
}