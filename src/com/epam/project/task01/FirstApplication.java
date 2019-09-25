package com.epam.project.task01;

import com.epam.project.task01.creater.CreaterArray;
import com.epam.project.task01.util.ArrayStatisticStream;
import com.epam.project.task01.util.ArrayUtil;

import java.util.Arrays;

public class FirstApplication {
    private static final String PATH = "resources/data.txt";

    public static void main(String[] args) {

        double[] array = CreaterArray.createArrayRandom(10);
        System.out.println(Arrays.toString(array));

        double min = ArrayUtil.findMin(array);
        System.out.println("(Handler) min = " + min);
        System.out.println("(Stream)  min = " + ArrayStatisticStream.findMin(array));

        double max = ArrayUtil.findMax(array);
        System.out.println("(Handler) max = " + max);
        System.out.println("(Stream)  max = " + ArrayStatisticStream.findMax(array));

        double sum = ArrayUtil.sum(array);
        System.out.println("(Handler) sum = " + sum);
        System.out.println("(Stream)  sum = " + ArrayStatisticStream.sum(array));

        double average = ArrayUtil.average(array);
        System.out.println("(Handler) average value : " + average);
        System.out.println("(Stream)  average value : " + ArrayStatisticStream.average(array));

        ArrayUtil.replace(array, (int)average);
        System.out.println(Arrays.toString(array));

        double[] arrayForSort1 =  CreaterArray.createArrayRandom(10);
        System.out.println("\n" + Arrays.toString(arrayForSort1));
        ArrayUtil.sortBubble(arrayForSort1);
        System.out.println(Arrays.toString(arrayForSort1));

        double[] arrayForSort2 =  CreaterArray.createArrayRandom(10);
        System.out.println("\n" + Arrays.toString(arrayForSort2));
        ArrayUtil.sortShell(arrayForSort2);
        System.out.println(Arrays.toString(arrayForSort2));

        double[] arrayForSort3 =  CreaterArray.createArrayRandom(11);
        System.out.println("\n" + Arrays.toString(arrayForSort3));
        double[] arraySorted = ArrayUtil.sortMerge(arrayForSort3);
        System.out.println(Arrays.toString(arraySorted));

        double[] arrayDouble = CreaterArray.createFromFile(PATH);
        System.out.println("\n" + Arrays.toString(arrayDouble));


    }
}
