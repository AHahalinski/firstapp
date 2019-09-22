package com.epam.project.task01.exception_handler;

public class PathFileIsNullHandlerException extends RuntimeException {

    private static final String message = "Path is null ";

    public PathFileIsNullHandlerException() {
        super(message);
    }
}
