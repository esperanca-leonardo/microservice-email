package com.esperanca.microservices.email.domain.email.service;

import com.esperanca.microservices.email.core.utils.helpers.email.EmailHelper;
import com.esperanca.microservices.email.domain.email.entity.Email;
import com.esperanca.microservices.email.domain.email.repository.EmailRepository;
import lombok.AllArgsConstructor;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import static com.esperanca.microservices.email.domain.email.enums.StatusEmail.ERROR;
import static com.esperanca.microservices.email.domain.email.enums.StatusEmail.SEND;

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
            this.emailHelper.updateEmailStatus(email, SEND);
        }
        catch (MailException mailException) {
            this.emailHelper.updateEmailStatus(email, ERROR);
            mailException.printStackTrace();
        }
        finally {
            this.repository.save(email);
        }
    }
}
