package com.example.ltw.demo.services;

import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.stereotype.Service;

@Service
public class FooServiceImpl implements FooService, LoadTimeWeaverAware {

    private LoadTimeWeaver loadTimeWeaver;

    @Override
    public String sayHello() {
        return "hello";
    }

    @Override
    public void setLoadTimeWeaver(LoadTimeWeaver loadTimeWeaver) {
        this.loadTimeWeaver = loadTimeWeaver;
    }
}
