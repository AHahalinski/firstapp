package com.epam.project.task01.exception;

public class PathFileIsNullHandlerException extends RuntimeException {
    public PathFileIsNullHandlerException() {
    }

    public PathFileIsNullHandlerException(String message) {
        super(message);
    }

    public PathFileIsNullHandlerException(String message, Throwable cause) {
        super(message, cause);
    }

    public PathFileIsNullHandlerException(Throwable cause) {
        super(cause);
    }

    public PathFileIsNullHandlerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
