package com.spring.aop.demoaop;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void print(String text) {
        System.out.println(text);
    }
}
