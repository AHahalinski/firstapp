package com.epam.project.task01.exception_handler;

public class PathFileIsNullException extends RuntimeException {

    private static final String message = "Path is null ";

    public PathFileIsNullException() {
        super(message);
    }
}
