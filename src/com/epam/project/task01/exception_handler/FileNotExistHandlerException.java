package com.epam.project.task01.exception_handler;

public class FileNotExistHandlerException extends RuntimeException {

    private static final String MESSAGE = "File not exist ";

    public FileNotExistHandlerException() {
        super(MESSAGE);
    }
}
