package com.rahul.complex.email;

import org.springframework.stereotype.Component;

@Component("google")
public class GmailService implements EmailService {

    public void sendEmail(String to, String body) {
        System.out.println("-----------------Google Email Service----------------");
        System.out.println("To : " + to);
        System.out.println("Message : " + body );
        System.out.println("-----------------------------------------------------");

    }
}
