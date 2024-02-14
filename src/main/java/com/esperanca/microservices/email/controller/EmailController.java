package com.esperanca.microservices.email.controller;

import com.esperanca.microservices.email.dto.EmailDto;
import com.esperanca.microservices.email.entity.Email;
import com.esperanca.microservices.email.service.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class EmailController {

    @Autowired
    private EmailService service;

    @PostMapping
    public ResponseEntity<Email> sendEmail(@RequestBody @Valid EmailDto emailDto) {
        final var email = new Email();
        BeanUtils.copyProperties(emailDto, email);
        service.sendEmail(email);

        return new ResponseEntity<>(email, HttpStatus.CREATED);
    }

    @GetMapping
    public String banana() {
        return "teste";
    }

    @GetMapping
    public String test() {
        return "nova funcionalidade da branch develop";
    }
}
