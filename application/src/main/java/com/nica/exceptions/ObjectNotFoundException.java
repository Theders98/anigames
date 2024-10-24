package com.nica.exceptions;

public class ObjectNotFoundException extends RuntimeException {

    private static final int ERROR_CODE = 404;

    public ObjectNotFoundException(String message) {
        super(message);
    }

    public static int getErrorCode() {
        return ERROR_CODE;
    }
}
