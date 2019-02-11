package com.registration.caseregistration.model;


import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "case")
public class Case extends AuditDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "caseObj" ,cascade = CascadeType.ALL)
    private Set<CasePerson> casePers = new HashSet<>(0);

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public Set<CasePerson> getCasePers() {
        return casePers;
    }

    @Column(name = "case_number", nullable = false, unique = true)
    private String caseNumber;

}
