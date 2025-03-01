package com.java8.java8.Array;

import java.util.Arrays;

public class RemoveDublicate {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 4, 2, 4, 5, 6, 7, 3, 6};

        int[] list = Arrays.stream(arr).distinct().toArray();

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
