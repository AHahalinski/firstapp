package com.epam.project.task01.utils;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayUtilTest {

    private static final ArrayUtil ARRAY_UTIL = new ArrayUtil();

    @DataProvider(name = "arrayTest")
    private static Object[][] arrays() {
        return new Object[][]{
                {new double[]{0.1, -0.9, 9.3, 12.32, 0.0}, 12.32, -0.9, 20.82, 4.164, new double[]{-0.9, 0.0, 0.1, 9.3, 12.32}},
                {new double[]{-8.1, -10.3, 10, 0.36, 10.08}, 10.08, -10.3, 2.04, 0.408, new double[]{-10.3, -8.1, 0.36, 10, 10.08}},
                {new double[]{2.5, 5.3, -9.1}, 5.3, -9.1, -1.3, -0.433, new double[]{-9.1, 2.5, 5.3}}
        };
    }

    @Test(dataProvider = "arrayTest")
    public void testFindMin(double[] array, double expectedMax, double expectedMin,
                            double expectedSum, double expectedAverage, double[] expectedSortedArray) {
        double actualMin = ARRAY_UTIL.findMin(array);
        Assert.assertEquals(actualMin, expectedMin);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testFindMinNullPointerException() {
        ARRAY_UTIL.findMin(null);
    }

    @Test(dataProvider = "arrayTest")
    public void testFindMax(double[] array, double expectedMax, double expectedMin,
                            double expectedSum, double expectedAverage, double[] expectedSortedArray) {
        double actualMax = ARRAY_UTIL.findMax(array);
        Assert.assertEquals(actualMax, expectedMax);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testFindMaxNullPointerException() {
        ARRAY_UTIL.findMax(null);
    }

    @Test(dataProvider = "arrayTest")
    public void testSum(double[] array, double expectedMax, double expectedMin,
                        double expectedSum, double expectedAverage, double[] expectedSortedArray) {
        double actualSum = ARRAY_UTIL.sum(array);
        Assert.assertEquals(actualSum, expectedSum, 0.001);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testSumNullPointerException() {
        ARRAY_UTIL.sum(null);
    }

    @Test(dataProvider = "arrayTest")
    public void testAverage(double[] array, double expectedMax, double expectedMin,
                            double expectedSum, double expectedAverage, double[] expectedSortedArray) {
        double actualAverage = ARRAY_UTIL.average(array);
        Assert.assertEquals(actualAverage, expectedAverage, 0.001);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testAverageNullPointerException() {
        ARRAY_UTIL.average(null);
    }

    @Test
    public void testReplace() {
        double[] array = new double[] {0.1, -11.01, -25.0, 10, 10, 11};
        double[] expectedArray = new double[]{0.1, 0, 0, 10, 10, 11};
        double[] actualArray = ARRAY_UTIL.replace(array, 0);
        Assert.assertEquals(actualArray, expectedArray);
    }

    @Test(dataProvider = "arrayTest")
    public void testSortBubble(double[] array, double expectedMax, double expectedMin,
                               double expectedSum, double expectedAverage, double[] expectedSortedArray) {
        double[] actualArraySorted = ArrayUtil.sortBubble(array);
        Assert.assertEquals(actualArraySorted, expectedSortedArray);
    }

    @Test(dataProvider = "arrayTest")
    public void testSortShell(double[] array, double expectedMax, double expectedMin,
                              double expectedSum, double expectedAverage, double[] expectedSortedArray) {
        double[] actualArraySorted = ArrayUtil.sortShell(array);
        Assert.assertEquals(actualArraySorted, expectedSortedArray);
    }

    @Test(dataProvider = "arrayTest")
    public void testSortMerge(double[] array, double expectedMax, double expectedMin,
                              double expectedSum, double expectedAverage, double[] expectedSortedArray) {
        double[] actualArraySorted = ArrayUtil.sortMerge(array);
        Assert.assertEquals(actualArraySorted, expectedSortedArray);
    }
}