package com.person.controller;

import com.person.model.Person;
import com.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("rest/db")
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @PostMapping("/create")
    public Person createPerson(@RequestBody final Person person) {
        System.out.println(person.toString());
        return repository.save(person);
    }

    @GetMapping("/findAll")
    public List<Person> findAllPerson() {
        return repository.findAll();
    }

    @PostMapping("/delete/{id}")
    public void deletePerson(@PathVariable("id ") Long id) {
        repository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Person findPerson(@PathVariable("id") Long id) {
        Optional<Person> optional = repository.findById(id);
        return optional.get();
    }


}
