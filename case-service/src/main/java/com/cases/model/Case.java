package com.cases.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Builder;
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
    @Column(name = "case_id")
    private Long caseId;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "caseObj", cascade = CascadeType.ALL, targetEntity = CasePerson.class)
    private Set<CasePerson> casePers = new HashSet<>(0);

    @Column(name = "case_number", nullable = false, unique = true)
    private String caseNumber;

    public Case() {
    }

    public Case(Set<CasePerson> casePers, String caseNumber) {
        this.caseNumber = caseNumber;
        this.casePers = casePers;
        this.casePers.forEach(a -> a.setCaseObj(this));
    }

   public Set<CasePerson> getCasePers() {
        return casePers;
    }

}
