package com.esperanca.microservices.email.domain.email.repository;

import com.esperanca.microservices.email.domain.email.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
}
