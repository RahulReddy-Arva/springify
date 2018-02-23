package com.rahul.complex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        NotificationService service = context.getBean(NotificationService.class);
        service.sendMsg("example@demo.com" , "Testing the DI using Spring");


        context.close();
    }
}
