package com.java8.java8.Math;

import java.util.Arrays;
import java.util.List;

public class SquareNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> ans = list.stream().map(e -> e * e).toList();

        ans.forEach(e -> System.out.println(e));
    }
}