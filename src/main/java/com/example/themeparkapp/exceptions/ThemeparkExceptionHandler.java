package com.example.themeparkapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ThemeparkExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorClass> callMethod(RideNotFoundException e){
        ErrorClass errorClass=new ErrorClass(e.getMessage(), HttpStatus.NOT_FOUND.toString(),System.currentTimeMillis());
        return new ResponseEntity<ErrorClass>(errorClass,HttpStatus.NOT_FOUND);
    }
}
