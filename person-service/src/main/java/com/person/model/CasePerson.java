package com.person.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Objects;

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
