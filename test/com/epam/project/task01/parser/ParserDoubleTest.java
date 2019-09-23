package com.epam.project.task01.parser;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ParserDoubleTest {

    private static final ParserDouble PARSER_DOUBLE = new ParserDouble();

    @Test(expectedExceptions = NullPointerException.class)
    public void testParseThrowNullPointerException() {
        String stringNull = null;
        PARSER_DOUBLE.parse(stringNull);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testParseThrowNumberFormatException() {
        String string = "0.f2 3 -2.01";
        PARSER_DOUBLE.parse(string);
    }

    @Test
    public void testParseValidValue() {
        String string = "0.2 3 -2.01";
        List<Double> expectedList = Arrays.asList(0.2, 3.0, -2.01);
        List<Double> actualList = PARSER_DOUBLE.parse(string);
        Assert.assertEquals(actualList, expectedList);
    }
}