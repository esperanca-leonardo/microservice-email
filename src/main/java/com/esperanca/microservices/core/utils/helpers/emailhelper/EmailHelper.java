package com.esperanca.microservices.core.utils.helpers.emailhelper;

import com.esperanca.microservices.email.entity.Email;
import com.esperanca.microservices.email.enums.StatusEmail;
import org.springframework.mail.SimpleMailMessage;

public interface EmailHelper {

    SimpleMailMessage createMessage(Email email);

    void updateEmailStatus(Email email, StatusEmail status);
}
