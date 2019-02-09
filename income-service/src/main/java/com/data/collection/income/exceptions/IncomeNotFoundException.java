package com.data.collection.income.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class IncomeNotFoundException extends RuntimeException {
    public IncomeNotFoundException() {
    }

    public IncomeNotFoundException(String message) {
        super(message);
    }

    public IncomeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncomeNotFoundException(Throwable cause) {
        super(cause);
    }
}
