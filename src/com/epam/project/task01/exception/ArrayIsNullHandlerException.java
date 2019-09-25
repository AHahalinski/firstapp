package com.epam.project.task01.exception;

public class ArrayIsNullHandlerException extends RuntimeException {
    public ArrayIsNullHandlerException() {
    }

    public ArrayIsNullHandlerException(String message) {
        super(message);
    }

    public ArrayIsNullHandlerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayIsNullHandlerException(Throwable cause) {
        super(cause);
    }

    public ArrayIsNullHandlerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
