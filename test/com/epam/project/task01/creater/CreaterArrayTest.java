package com.epam.project.task01.creater;

import com.epam.project.task01.exception.FileIsEmptyHandlerException;
import com.epam.project.task01.exception.FileNotExistHandlerException;
import com.epam.project.task01.exception.PathFileIsNullHandlerException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreaterArrayTest {

    private static final CreaterArray CREATER_ARRAY = new CreaterArray();

    private static final String PATH_VALID = "D:\\_ПРОГРАММИРОВАНИЕ_\\EPAM\\firstapp\\test\\resources\\dataTestValid.txt";
    private static final String PATH_EMPTY = "D:\\_ПРОГРАММИРОВАНИЕ_\\EPAM\\firstapp\\test\\resources\\dataTestEmpty.txt";

    @Test
    public void testCreateArrayRandomSizeTen() {
        int expected = 10;
        double[] array = CREATER_ARRAY.createArrayRandom(expected);
        int actualSize = array.length;
        Assert.assertEquals(actualSize, expected);
    }

    @Test
    public void testCreateFromFilePositive() {
        int expectedSize = 4;
        double[] array = CREATER_ARRAY.createFromFile(PATH_VALID);
        int actualSize = array.length;
        Assert.assertEquals(actualSize, expectedSize);
    }

    @Test(expectedExceptions = PathFileIsNullHandlerException.class)
    public void testCreateFromFileExceptionPathNull() {
        String pathNull = null;
        CREATER_ARRAY.createFromFile(pathNull);
    }

    @Test(expectedExceptions = FileIsEmptyHandlerException.class)
    public void testCreateFromFileExceptionEmpty() {
        CREATER_ARRAY.createFromFile(PATH_EMPTY);
    }

    @Test(expectedExceptions = FileNotExistHandlerException.class)
    public void testCreateFromFileExceptionNotExist(){
        CREATER_ARRAY.createFromFile("//fileNotExist.txt");
    }

    @Test(expectedExceptions = FileNotExistHandlerException.class)
    public void testCreateFromFileExceptionIsNotFile(){
        CREATER_ARRAY.createFromFile("D:\\_ПРОГРАММИРОВАНИЕ_\\EPAM\\firstapp\\test\\resources\\dataTestEmpty");
    }
}