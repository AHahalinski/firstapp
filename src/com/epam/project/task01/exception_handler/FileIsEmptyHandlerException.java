package com.epam.project.task01.exception_handler;

public class FileIsEmptyHandlerException extends RuntimeException {

    private static final String MESSAGE = "File is empty";

    public FileIsEmptyHandlerException() {
        super(MESSAGE);
    }
}
