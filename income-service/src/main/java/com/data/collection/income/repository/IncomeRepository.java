package com.data.collection.income.repository;

import com.data.collection.income.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IncomeRepository extends JpaRepository<Income, Long> {

    public Optional<List<Income>> findIncomesByPersCIN(String personCIN);
}
