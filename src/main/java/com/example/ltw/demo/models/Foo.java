package com.example.ltw.demo.models;

import com.example.ltw.demo.services.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable(value = "foo")
public class Foo {

    private FooService fooService;

    public Foo() {
        System.out.println("Creating foo...");
    }

    public FooService getFooService() {
        return fooService;
    }

    @Autowired
    public void setFooService(FooService fooService) {
        this.fooService = fooService;
    }

    public String sayHello() {
        return fooService.sayHello();
    }
}
