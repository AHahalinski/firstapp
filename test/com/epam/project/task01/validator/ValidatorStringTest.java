package com.epam.project.task01.validator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ValidatorStringTest {

    private static final ValidatorString VALIDATOR_STRING = new ValidatorString();

    @Test(dataProvider = "strings")
    public void testCheckValid(String string, boolean expectedResult) {
        boolean actualResult = VALIDATOR_STRING.checkValid(string);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @DataProvider(name = "strings")
    public static Object[][] lines() {
        return new Object[][]{
                {"1 2 0 0.3", true},
                {"u2.3 2.3 5-8", false},
                {"0.02d 1258.0001 0.0 0", true},
                {"-2+6 1 2 9 8888888", false},
                {"0.0 0 --8 8.2111", false},
                {"", false}
        };
    }
}