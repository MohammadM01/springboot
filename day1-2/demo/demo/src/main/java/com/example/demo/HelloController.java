package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    // --> /hello
    // --> /order
    // --> /payment

    @GetMapping("hello")
    public String hello(){
        return "<h1>Hello World!</h1>";
    }

    @GetMapping("order")
    public String order(){
        return "<h1>Your order is ready!</h1>";
    }
}
