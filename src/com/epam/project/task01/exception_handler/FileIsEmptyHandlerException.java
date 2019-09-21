package com.epam.project.task01.exception_handler;

public class FileIsEmptyHandlerException extends RuntimeException {

    private static final String message = "File is empty";

    public FileIsEmptyHandlerException() {
        super(message);
    }
}
