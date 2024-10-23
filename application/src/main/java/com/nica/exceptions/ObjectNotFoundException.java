package com.nica.exceptions;

public class ObjectNotFoundException extends RuntimeException{
    private static final int errorCode = 404;

    public ObjectNotFoundException(String message) {
        super(message);
    }
}
