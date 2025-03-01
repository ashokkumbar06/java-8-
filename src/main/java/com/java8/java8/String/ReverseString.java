package com.java8.java8.String;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    public static void main(String[] args) {

        String a = "ashok";
        System.out.println(a);
        String s = IntStream.range(0, a.length())
                .mapToObj(i -> a.charAt(a.length() - i - 1))
                .map(Object::toString)
                .collect(Collectors.joining());
        System.out.println(s);
    }
}
