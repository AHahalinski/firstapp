package com.epam.project.task01.util;


import com.epam.project.task01.exception.ArrayIsNullHandlerException;

public class ArrayUtil {

    public static double findMin(double[] array)  {
        checkNull(array);

        double minElementArray = array[0];

        for (int i = 1; i < array.length; i++) {
            if (minElementArray > array[i]) {
                minElementArray = array[i];
            }
        }
        return minElementArray;
    }

    public static double findMax(double[] array) {
        checkNull(array);

        double maxElementArray = array[0];

        for (int i = 1; i < array.length; i++) {
            if (maxElementArray < array[i]) {
                maxElementArray = array[i];
            }
        }
        return maxElementArray;
    }

    public static double sum(double[] array) {
        checkNull(array);

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double average(double[] array) {
        checkNull(array);

        double value;

        int size = array.length;
        double sum = sum(array);
        value = sum / size;
        return value;
    }

    public static double[] replace(double[] array, double value) {
        checkNull(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < value) {
                array[i] = value;
            }
        }
        return array;
    }

    public static double[] sortBubble(double[] array) {
        checkNull(array);

        boolean isSorted = false;
        double temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

    public static double[] sortShell(double[] array) {
        checkNull(array);

        double temp;

        for (int i = 0; i < array.length - 1; ) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        return array;
    }

    public static double[] sortMerge(double[] array) {
        checkNull(array);

        if (array.length == 1) {
            return array;
        }

        double[] arrayA = new double[array.length / 2];
        System.arraycopy(array, 0, arrayA, 0, arrayA.length);

        double[] arrayB = new double[array.length - arrayA.length];
        System.arraycopy(array, array.length / 2, arrayB, 0, arrayB.length);

        arrayA = sortMerge(arrayA);
        arrayB = sortMerge(arrayB);

        double[] arrayC = merge(arrayA, arrayB);

        return arrayC;
    }

    private static double[] merge(double[] arrayA, double[] arrayB) {
        double[] arrayMarge = new double[arrayA.length + arrayB.length];
        int indexArrayA = 0;
        int indexArrayB = 0;
        int i = 0;

        while (indexArrayA < arrayA.length && indexArrayB < arrayB.length) {
            if (arrayA[indexArrayA] <= arrayB[indexArrayB]) {
                arrayMarge[i++] = arrayA[indexArrayA++];
            }
            else {
                arrayMarge[i++] = arrayB[indexArrayB++];
            }
        }

        while (indexArrayA < arrayA.length) {
            arrayMarge[i++] = arrayA[indexArrayA++];
        }

        while (indexArrayB < arrayB.length) {
            arrayMarge[i++] = arrayB[indexArrayB++];
        }
        return arrayMarge;
    }

    static void checkNull(double[] array) throws ArrayIsNullHandlerException{
        if (array == null) {
            throw new ArrayIsNullHandlerException("NullPointerException");
        }
    }

}
