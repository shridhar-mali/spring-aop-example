package com.spring.aop.demoaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@ComponentScan("com.spring.aop.demoaop")
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Autowired
    private MyService myService;

    @PostConstruct
    private void init() {
        myService.print("hello");

    }


}
