package com.epam.project.task01.exception;

public class FileIsEmptyHandlerException extends RuntimeException {
    public FileIsEmptyHandlerException() {
    }

    public FileIsEmptyHandlerException(String message) {
        super(message);
    }

    public FileIsEmptyHandlerException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileIsEmptyHandlerException(Throwable cause) {
        super(cause);
    }

    public FileIsEmptyHandlerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
