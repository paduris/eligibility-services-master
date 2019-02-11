package com.data.collection.income.controller;

import com.data.collection.income.exceptions.IncomeNotFoundException;
import com.data.collection.income.model.Income;
import com.data.collection.income.repository.IncomeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest/income")
@Slf4j
public class IncomeController {

    private IncomeRepository repository;

    @Autowired
    public IncomeController(IncomeRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/create")
    public Income createIncome(@RequestBody Income income) {
        return this.repository.save(income);
    }

    @GetMapping("/findPersonIncome/{personCIN}")
    public List<Income> getIncomeForPerson(@PathVariable String personCIN) {
        return repository.findIncomesByPersCIN(personCIN).orElseThrow(() -> new IncomeNotFoundException("No Income found for the person with cin " + personCIN));
    }

}
