package com.java8.java8.Math;

import java.util.Arrays;
import java.util.List;

public class printAvgNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 7);

        double avg = list.stream().mapToInt(i -> i).average().getAsDouble();

        System.out.println(avg);
    }
}

