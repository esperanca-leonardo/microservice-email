package com.esperanca.microservices.email.entity;

import com.esperanca.microservices.email.enums.StatusEmail;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Email implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String owner;

    @Value("${SPRING_MAIL_USERNAME}")
    private String emailFrom;

    private String emailTo;
    private String subject;
    private String text;

    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
