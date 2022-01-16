package com.example.CustomException.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = InputException.class)
    public ResponseEntity<Object> handleInputFieldException(InputException exception) {

        InputExceptionInfo exDetail = new InputExceptionInfo(exception.getMessage(),"Try to insert valid values","Input-01");
        return new ResponseEntity<>(exDetail, HttpStatus.BAD_REQUEST);
    }
}
