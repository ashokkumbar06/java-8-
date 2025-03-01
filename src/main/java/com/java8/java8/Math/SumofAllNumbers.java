package com.java8.java8.Math;

import java.util.List;
import java.util.Optional;

public class SumofAllNumbers {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);

        System.out.println(sum.get());
    }
}
