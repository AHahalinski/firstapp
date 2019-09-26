package com.epam.project.task01.parser;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParserDouble {

    public static List<Double> parse(String string) {
        String[] split = string.split("\\s+");

        List<Double> listData = Arrays.stream(split)
                .map(element -> Double.parseDouble(element))
                .collect(Collectors.toList());
        return listData;
    }
}
