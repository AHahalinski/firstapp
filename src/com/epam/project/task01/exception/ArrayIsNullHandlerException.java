package com.epam.project.task01.exception;

public class ArrayIsNullHandlerException extends RuntimeException {
    private static final String MESSAGE = "Object 'array' is nul";

    public ArrayIsNullHandlerException() {
        super(MESSAGE);
    }
}
