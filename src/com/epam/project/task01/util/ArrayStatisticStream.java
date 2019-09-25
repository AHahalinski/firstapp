package com.epam.project.task01.util;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;

public class ArrayStatisticStream {

    public static double findMin(double[] array) {
        ArrayUtil.checkNull(array);

        DoubleSummaryStatistics doubleSummaryStatistics = Arrays.stream(array).summaryStatistics();
        double min = doubleSummaryStatistics.getMin();
        return min;
    }

    public static double findMax(double[] array) {
        ArrayUtil.checkNull(array);

        DoubleSummaryStatistics doubleSummaryStatistics = Arrays.stream(array).summaryStatistics();
        double max = doubleSummaryStatistics.getMax();
        return max;
    }

    public static double sum(double[] array) {
        ArrayUtil.checkNull(array);

        DoubleSummaryStatistics doubleSummaryStatistics = Arrays.stream(array).summaryStatistics();
        double sum = doubleSummaryStatistics.getSum();
        return sum;
    }

    public static double average(double[] array) {
        ArrayUtil.checkNull(array);

        DoubleSummaryStatistics doubleSummaryStatistics = Arrays.stream(array).summaryStatistics();
        double average = doubleSummaryStatistics.getAverage();
        return average;
    }
}
