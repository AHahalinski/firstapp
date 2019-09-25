package com.epam.project.task01.validator;

public class Validator {

    private static final String REGEX = "^([+-]?\\d+(\\.\\d+)?(d|D)?([ ]+|$))+$";

    public static boolean checkValid(String string) {

        return string.matches(REGEX);
    }
}
