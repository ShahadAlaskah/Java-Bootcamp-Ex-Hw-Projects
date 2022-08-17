package com.example.javaday12.Exceptions;

public class ApiException extends RuntimeException{
    public ApiException(String message) {
        super(message);
    }
}
