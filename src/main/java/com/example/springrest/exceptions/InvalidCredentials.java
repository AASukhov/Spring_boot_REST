package com.example.springrest.exceptions;

public class InvalidCredentials extends RuntimeException{
    public InvalidCredentials(String msg) {
        super(msg);
    }
}
