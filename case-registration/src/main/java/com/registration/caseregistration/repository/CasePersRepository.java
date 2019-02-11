package com.registration.caseregistration.repository;

import com.registration.caseregistration.model.CasePerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CasePersRepository extends JpaRepository<CasePerson,Long> {
}
