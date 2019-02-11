package com.data.collection.income.services;


import com.data.collection.income.model.Income;
import com.data.collection.income.repository.IncomeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@Slf4j
public class IncomeService {

    private IncomeRepository repository;

    private Income save(Income income) {
        return repository.save(income);
    }

    private Optional<List<Income>> getPersonIncome(String personCIN) {
        return repository.findIncomesByPersCIN(personCIN);
    }


}
