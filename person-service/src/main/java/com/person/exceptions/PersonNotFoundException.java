package com.person.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception class
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends RuntimeException {

    public PersonNotFoundException() {
    }

    public PersonNotFoundException(String message) {
        super(message);

    }

    public PersonNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
    public PersonNotFoundException(Throwable throwable) {
        super(throwable);
    }
}
