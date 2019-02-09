package com.data.collection.income.exceptions;

import lombok.Data;

import java.util.Date;

@Data
public class ExceptionResponse {
    private String message;
    private String details;
    private Date timestamp;

    public ExceptionResponse(String message, String details, Date timestamp) {
        this.message = message;
        this.details = details;
        this.timestamp = timestamp;
    }


}
