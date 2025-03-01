package com.java8.java8.String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UppercaseFirstLetter {

    public static void main(String[] args) {

        String s = "welcome to java stream api";

        String[] words = s.split(" ");

        String ans = Arrays.stream(words).map(e -> e.substring(0, 1).toUpperCase() + e.substring(1)).collect(Collectors.joining(" "));
        System.out.println(ans);
    }

}