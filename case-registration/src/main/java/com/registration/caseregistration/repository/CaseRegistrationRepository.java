package com.registration.caseregistration.repository;

import com.registration.caseregistration.model.Case;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRegistrationRepository extends JpaRepository<Case,Long> {
}
