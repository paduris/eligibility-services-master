package com.registration.caseregistration.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"createdOn","updatedOn"},allowGetters = true
)
public abstract class AuditDTO {

    @UpdateTimestamp
    @Column(name="updated_on")
    @LastModifiedDate
    private Date updatedOn;

    @CreationTimestamp
    @Column(name="created_on", nullable = false, updatable = false)
    private Date createdOn;

    @Column(name = "effective_date")
    private Date effectiveDate;

    @Column(name = "end_date")
    private Date endDate;
}
