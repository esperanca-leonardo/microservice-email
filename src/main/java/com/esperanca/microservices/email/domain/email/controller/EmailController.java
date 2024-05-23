package com.esperanca.microservices.email.domain.email.controller;

import com.esperanca.microservices.email.domain.email.dto.EmailDto;
import com.esperanca.microservices.email.domain.email.entity.Email;
import com.esperanca.microservices.email.domain.email.service.EmailService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping
@AllArgsConstructor
public class EmailController {

    private final EmailService service;

    @PostMapping
    public ResponseEntity<Email> sendEmail(@RequestBody @Valid EmailDto emailDto) {
        final var email = new Email();
        BeanUtils.copyProperties(emailDto, email);
        service.sendEmail(email);

        return new ResponseEntity<>(email, CREATED);
    }

    @GetMapping
    public String banana() {
        return "teste";
    }

    @GetMapping("/teste")
    public String test() {
        return "nova funcionalidade da branch develop";
    }
}
