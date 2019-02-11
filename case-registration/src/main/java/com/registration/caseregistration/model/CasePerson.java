package com.registration.caseregistration.model;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "case_pers")
@Data
public class CasePerson extends AuditDTO {

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(name = "case_id", nullable = false,unique = true)
    private Long caseId;

    @Column(name = "pers_cin", nullable = false, unique = true)
    private String persCIN;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "case_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Case caseObj;
}
