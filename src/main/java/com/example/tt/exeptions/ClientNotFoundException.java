package com.example.tt.exeptions;

public class ClientNotFoundException extends Exception{
    public ClientNotFoundException(String message) {
        super(message);
    }
}
