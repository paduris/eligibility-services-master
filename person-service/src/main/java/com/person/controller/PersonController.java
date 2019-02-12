package com.person.controller;

import com.person.exceptions.PersonNotFoundException;
import com.person.model.Person;
import com.person.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Controller class
 *
 * @author spaduri
 */

@Slf4j
@RestController
@RequestMapping("api/person")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/create")
    public Person createPerson(@RequestBody final Person person) {
        return personService.save(person);
    }

    @GetMapping("/findAll")
    public List<Person> findAllPerson() {
        return personService.findAll();
    }

    @PostMapping("/delete/{id}")
    public void deletePerson(@PathVariable("id ") Long id) {
        personService.deletePerson(id);
    }

    @GetMapping("/find/{id}")
    public Person findPerson(@PathVariable("id") Long id) {
        return personService.findPerson(id).orElseThrow(() -> new PersonNotFoundException("Person with this id " + id + "doesn't exist"));
    }
}
