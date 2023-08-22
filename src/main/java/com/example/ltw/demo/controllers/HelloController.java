package com.example.ltw.demo.controllers;


import com.example.ltw.demo.models.Foo;
import com.example.ltw.demo.services.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private FooService fooService;

    @GetMapping("/hello")
    public String hello() {
        return fooService.sayHello();
    }


    @GetMapping("/ltw")
    public String ltw() {
       return new Foo().sayHello();
    }

}
