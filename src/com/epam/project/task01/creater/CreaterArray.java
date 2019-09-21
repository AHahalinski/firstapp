package com.epam.project.task01.creater;

import com.epam.project.task01.reader.ReaderData;
import com.epam.project.task01.validator.ValidatorString;
import com.epam.project.task01.exception_handler.FileNotExistHandlerException;
import com.epam.project.task01.exception_handler.FileIsEmptyHandlerException;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class CreaterArray {

    private static final int MIN_BOUND = -10;
    private static final int MAX_BOUND = 10;

    public static double[] createArrayRandom(int size) {
        Random random = new Random();

        double[] array = random.doubles(size, MIN_BOUND, MAX_BOUND)
                               .map(element -> element = (int)(element *10)/10d)
                               .toArray();

        return  array;

    }

    public static double[] createFromFile(String path) throws FileIsEmptyHandlerException {
        List<String> listAllData = null;
        try {
            listAllData = ReaderData.read(path);
        } catch (IOException e) {
            throw new FileNotExistHandlerException();
        }

        if (listAllData == null || listAllData.isEmpty()) {
            throw new FileIsEmptyHandlerException();
        }

        List<Double> listData = new ArrayList<>();

        for (String str : listAllData) {
            if(ValidatorString.checkValid(str)) {
                String[] split = str.split(" ");
                List<Double> tempList = Arrays.stream(split)
                                              .map(element -> Double.parseDouble(element))
                                              .collect(Collectors.toList());
                listData.addAll(tempList);
            }
        }

        double[] arrayData = new double[listData.size()];

        for (int i = 0; i < listData.size(); i++) {
            arrayData[i] = listData.get(i);
        }

        return arrayData;
    }
}
