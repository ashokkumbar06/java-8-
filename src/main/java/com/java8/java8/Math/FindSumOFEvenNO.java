package com.java8.java8.Math;

import java.util.Arrays;

public class FindSumOFEvenNO {

    public static void main(String[] args) {

        // find the sum of all the even numbers given in an array

        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        int sum = Arrays.stream(arr).filter(e -> e%2 == 0).sum();

        System.out.println(sum);
    }
}