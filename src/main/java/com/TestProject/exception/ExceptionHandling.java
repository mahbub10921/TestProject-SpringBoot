package com.TestProject.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandling {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> invalidMessage(MethodArgumentNotValidException ex){
        Map<String, String> showMessage = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(each ->{
            showMessage.put(each.getField(), each.getDefaultMessage());

        });
        return showMessage;
    }
}
