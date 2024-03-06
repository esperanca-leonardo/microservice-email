package com.esperanca.microservices.email.service;

import com.esperanca.microservices.core.utils.helpers.emailhelper.EmailHelper;
import com.esperanca.microservices.email.entity.Email;
import com.esperanca.microservices.email.enums.StatusEmail;
import com.esperanca.microservices.email.repository.EmailRepository;
import lombok.AllArgsConstructor;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailServiceImpl implements EmailService {

    private final EmailHelper emailHelper;
    private final JavaMailSender mailSender;
    private final EmailRepository repository;

    @Override
    public void sendEmail(Email email) {
        try {
            final var message = this.emailHelper.createMessage(email);
            this.mailSender.send(message);

            email.setStatusEmail(StatusEmail.SEND);
        }
        catch (MailException mailException) {
            email.setStatusEmail(StatusEmail.ERROR);
            mailException.printStackTrace();
        }
        finally {
            this.repository.save(email);
        }
    }
}
