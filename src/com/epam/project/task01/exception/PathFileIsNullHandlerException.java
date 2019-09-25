package com.epam.project.task01.exception;

public class PathFileIsNullHandlerException extends RuntimeException {

    private static final String MESSAGE = "Path is null ";

    public PathFileIsNullHandlerException() {
        super(MESSAGE);
    }
}