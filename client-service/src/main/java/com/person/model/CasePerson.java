package com.person.model;

import lombok.*;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
public class CasePerson {

    @NonNull
    private Date effectiveDate;
    @NonNull
    private String personClientNumber;
    private Date endDate;

}
