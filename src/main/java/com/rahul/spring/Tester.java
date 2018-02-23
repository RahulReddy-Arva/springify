package com.rahul.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

         HelloSpring hello = context.getBean(HelloSpring.class);
         hello.sayHello();

         HelloSpring hello1 = context.getBean(HelloSpring.class);
         hello1.sayHello();

         System.out.println( hello == hello1 );

        context.close();
    }
}
