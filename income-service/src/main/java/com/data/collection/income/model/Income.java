package com.data.collection.income.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "income")
public class Income extends AuditDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(max = 20)
    @Column(name = "type_code", nullable = false)
    private String typeCode;

    @Column(name = "pers_cin", nullable = false)
    @Size(max = 10)
    private String persCIN;

    @Column(name = "annual_income")
    private BigDecimal annualIncome;

    @Size(max = 100)
    @Column(name = "source")
    private String source;

    @Column(name = "effective_date", nullable = false)
    private Date effectiveDate;

    @Column(name = "end_date")
    private Date endDate;


}
