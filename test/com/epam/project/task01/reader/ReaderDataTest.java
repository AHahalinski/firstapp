package com.epam.project.task01.reader;

import com.epam.project.task01.exception_handler.FileNotExistHandlerException;
import com.epam.project.task01.exception_handler.PathFileIsNullHandlerException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class ReaderDataTest {

    private static final ReaderData READER_DATA = new ReaderData();
    private static final String PATH_VALID = "D:\\_ПРОГРАММИРОВАНИЕ_\\EPAM\\firstapp\\test\\resources\\dataTestValid.txt";

    @Test
    public void testReadSuccessful() throws IOException {
        List<String> expectedList = READER_DATA.read(PATH_VALID);
        Assert.assertNotNull(expectedList);
    }

    @Test(expectedExceptions = PathFileIsNullHandlerException.class)
    public void testReadExceptionPathFileIsNullException() throws IOException {
        READER_DATA.read(null);
    }

    @Test(expectedExceptions = FileNotExistHandlerException.class)
    public void testReadExceptionFileNotExistHandlerException() throws IOException {
        READER_DATA.read("//fileNotExist.txt");
    }
}