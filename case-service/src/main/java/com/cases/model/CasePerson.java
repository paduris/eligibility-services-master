package com.cases.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "case_pers")
@Data
@EqualsAndHashCode(exclude = "caseObj")
public class CasePerson extends AuditDTO {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "case_pers_id")
    private Long casePersId;

    @Column(name = "pers_cin", nullable = false, unique = true)
    private String personClientNumber;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "case_id")
    @JsonBackReference
    private Case caseObj;

    public CasePerson(String personClientNumber) {
        this.personClientNumber = personClientNumber;
    }

    public CasePerson() {
    }

    public void setCaseObj(Case caseObj) {
        this.caseObj = caseObj;
    }
}
