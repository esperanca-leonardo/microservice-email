package com.esperanca.microservices.email.service;

import com.esperanca.microservices.email.entity.Email;

public interface EmailService {

    void sendEmail(Email email);
}
