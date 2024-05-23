package com.esperanca.microservices.email.domain.email.service;

import com.esperanca.microservices.email.domain.email.entity.Email;

public interface EmailService {

    void sendEmail(Email email);
}
