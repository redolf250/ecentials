package com.redolf.developer.ecentials.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.PARTIAL_CONTENT)
public class ResourceException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourceException(String message) {
        super(message);
    }
}
