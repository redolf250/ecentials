package com.redolf.developer.ecentials.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
        private LocalTime timestamp;
        private String message;
        private String details;
}
