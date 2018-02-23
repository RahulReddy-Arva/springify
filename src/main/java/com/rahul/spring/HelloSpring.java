package com.rahul.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HelloSpring {

    public void sayHello() {
        System.out.println("Hello Guys!");
    }

}
