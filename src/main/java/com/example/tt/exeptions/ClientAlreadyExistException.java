package com.example.tt.exeptions;

public class ClientAlreadyExistException extends Exception {
    public ClientAlreadyExistException(String message) {
        super(message);
    }
}
