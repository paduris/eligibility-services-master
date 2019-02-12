package com.cases.repository;

import com.cases.model.Case;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Case,Long> {
}
