package com.javatpoint.controller;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(path ="/hello")
public class HelloWorldController {
    @GetMapping()
    public String hello() {
        System.out.println("Current Time: " +System.currentTimeMillis());
        return "Hello world";
    }

    @PostMapping()
    public String hello1(@RequestParam(name = "name") String name) {
        return "hello " + name;
    }
}