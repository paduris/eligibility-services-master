package com.person.service;

import com.person.controller.Case;
import com.person.controller.CasePerson;
import com.person.model.Person;
import com.person.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Service class
 */
@Service
@Transactional
@Slf4j
public class PersonService {

    private final PersonRepository repository;
    private final CaseServiceClient caseServiceClient;


    @Autowired
    public PersonService(PersonRepository repository, CaseServiceClient caseServiceClient) {
        this.repository = repository;
        this.caseServiceClient = caseServiceClient;
    }

    public List<Person> findAll() {
        return repository.findAll();
    }

    public Optional<Person> findPerson(Long id) {
        return repository.findById(id);
    }

    public void deletePerson(Long id) {
        repository.deleteById(id);
    }

    public Person save(Person person) {

        log.info("Entering Save Person");

        Person newPerson = repository.save(person);

        CasePerson casePerson = CasePerson.builder()
                .personClientNumber(newPerson.getCin())
                .effectiveDate(new Date())
                .endDate(null)
                .build();

        List<CasePerson> casePersonList = new ArrayList<>();

        casePersonList.add(casePerson);

        Case caseObj = Case.builder()
                .casePersons(casePersonList)
                .effectiveDate(new Date())
                .build();

        this.caseServiceClient.createCase(caseObj);

        log.info("Exiting save person :: Created Person "+ newPerson.getId());

        return newPerson;
    }
}
