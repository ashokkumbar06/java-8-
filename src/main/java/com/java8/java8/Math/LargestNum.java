package com.java8.java8.Math;

import java.util.Arrays;

public class LargestNum {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 99, 55, 3, 1, 443, 4, 999};

        int largestNum = Arrays.stream(a).max().orElseThrow(() -> new ArithmeticException());
        int smallestNum = Arrays.stream(a).min().orElseThrow(() -> new ArithmeticException());

        System.out.println(largestNum);
        System.out.println(smallestNum);
    }
}
