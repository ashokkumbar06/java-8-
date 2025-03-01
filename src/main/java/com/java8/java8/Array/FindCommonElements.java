package com.java8.java8.Array;

import java.util.Arrays;
import java.util.List;

public class FindCommonElements {

    // finding common elements in both arrays

    public static void main(String[] args) {

        int arr1[] = {80, 10, 15, 2, 35, 60};
        int arr2[] = {35, 80, 60, 20, 75};

        List<Integer> list = Arrays.stream(arr1)
                .filter(num -> Arrays.stream(arr2).anyMatch(n -> n == num)).boxed().toList();

        System.out.println(list);
    }
}
