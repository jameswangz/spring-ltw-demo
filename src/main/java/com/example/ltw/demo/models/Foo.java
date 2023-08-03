package com.example.ltw.demo.models;

import com.example.ltw.demo.services.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class Foo {

    @Autowired
    private FooService fooService;

    public String sayHello() {
        return fooService.sayHello();
    }
}
