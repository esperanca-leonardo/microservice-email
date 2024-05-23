package com.esperanca.microservices.email.core.utils.helpers.email;

import com.esperanca.microservices.email.domain.email.entity.Email;
import com.esperanca.microservices.email.domain.email.enums.StatusEmail;
import org.springframework.mail.SimpleMailMessage;

public interface EmailHelper {

    SimpleMailMessage createMessage(Email email);

    void updateEmailStatus(Email email, StatusEmail status);
}

