package com.example.tt.exeptions;

public class DocumentAlreadyExistException extends Exception{
    public DocumentAlreadyExistException(String message) {
        super(message);
    }
}
