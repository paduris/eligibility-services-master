package com.person.services;

import com.person.model.Person;
import com.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Service class
 */
@Service
@Transactional
public class PersonService {

    @Autowired
    private PersonRepository repository;

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
        return repository.save(person);
    }
}
