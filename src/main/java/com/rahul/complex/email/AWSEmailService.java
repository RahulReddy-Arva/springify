package com.rahul.complex.email;

import org.springframework.stereotype.Component;

@Component("aws")
public class AWSEmailService implements EmailService {

    public void sendEmail(String to, String body) {
        System.out.println("-----------------AWS Email Service----------------");
        System.out.println("To : " + to);
        System.out.println("Message : " + body );
        System.out.println("--------------------------------------------------");

    }
}
