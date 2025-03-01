package com.java8.java8.String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MakeUppercase {

    public static void main(String[] args) {

        //  input : welcome to java stream apis
        //  output : Welcome To Java Stream Apis

        String s = "welcome to java stream apis";
        String word [] = s.split(" ");
        String ans = Arrays.stream(word).map(e -> e.substring(0,1).toUpperCase()+e.substring(1))
                .collect(Collectors.joining(" "));
        System.out.println(s);
        System.out.println(ans);
    }
}
