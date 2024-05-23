package com.esperanca.microservices.email.core.config.beans.simplemailmessage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

@Configuration
public class SimpleMailMessageConfig {

    @Bean
    public SimpleMailMessage simpleMailMessage() {
        return new SimpleMailMessage();
    }
}
