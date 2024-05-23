package com.esperanca.microservices.email.core.utils.helpers.email;

import com.esperanca.microservices.email.domain.email.entity.Email;
import com.esperanca.microservices.email.domain.email.enums.StatusEmail;
import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class EmailHelperImpl implements EmailHelper {

    private final SimpleMailMessage message;

    @Override
    public SimpleMailMessage createMessage(Email email) {
        this.message.setFrom(email.getEmailFrom());
        this.message.setTo(email.getEmailTo());
        this.message.setSubject(email.getSubject());
        this.message.setText(email.getText());

        return this.message;
    }

    @Override
    public void updateEmailStatus(Email email, StatusEmail status) {
        email.setStatusEmail(status);
    }
}
