package com.esperanca.microservices.email.service;

import com.esperanca.microservices.email.entity.Email;
import com.esperanca.microservices.email.enums.StatusEmail;
import com.esperanca.microservices.email.repository.EmailRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;
    private final EmailRepository repository;

    public void sendEmail(Email email) {
        try {
            final var message = new SimpleMailMessage();

            message.setFrom(email.getEmailFrom());
            message.setTo(email.getEmailTo());
            message.setSubject(email.getSubject());
            message.setText(email.getText());

            mailSender.send(message);

            email.setStatusEmail(StatusEmail.SEND);
        }
        catch (MailException mailException) {
            email.setStatusEmail(StatusEmail.ERROR);
            mailException.printStackTrace();
        }
        finally {
//            repository.save(email);
            System.out.println("fake save");
        }
    }
}
