package com.example.ltw.demo.controllers;


import com.example.ltw.demo.models.Foo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
       return new Foo().sayHello();
    }

}
