package com.person.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person")
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "client_id_number", nullable = false, unique = true)
    private String cin;
    @Column(name = "disability_active", nullable = false)
    private boolean disabilityActive;
    @Column(name = "marital_status", nullable = false)
    private String maritalStatus;
    @Column(name = "ssn", nullable = false)
    private String ssn;
    @Column(name = "pregnancy_active", nullable = false)
    private boolean pregnancyActive;

}
