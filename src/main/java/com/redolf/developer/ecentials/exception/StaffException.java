package com.redolf.developer.ecentials.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalTime;

@ControllerAdvice
public class StaffException{

    @ExceptionHandler(ResourceException.class)
    public static ResponseEntity<?> cannotCreateStaff(ResourceException exception, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage(exception.getMessage());
        errorDetails.setTimestamp(LocalTime.now());
        errorDetails.setDetails(request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.CONFLICT);
    }
}
