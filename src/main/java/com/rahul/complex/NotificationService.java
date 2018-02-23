package com.rahul.complex;


import com.rahul.complex.email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class NotificationService {

    //Property based DI
    @Autowired
    @Qualifier("aws")
    private EmailService emailService ;

    //Constructor based DI
    /*
    public NotificationService (EmailService emailService) {
        this.emailService = emailService;
    }
    */

    public void sendMsg(String to, String message) {
        this.emailService.sendEmail(to,message);

    }

    //Setter based DI
//    @Autowired
//    public void setEmailService(EmailService emailService){
//        this.emailService = emailService;
//    }

}
