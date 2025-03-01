package com.java8.java8.String;

import java.util.StringJoiner;

public class SplitMethod {

    public static void main(String[] args) {

        StringJoiner str1 = new StringJoiner(",", "{", "}");
        str1.add("A").add("B").add("C");
        System.out.println(str1);
        StringJoiner str2 = new StringJoiner(":");
        str2.add("P").add("Q");
        System.out.println(str2);
        str1.merge(str2);
        System.out.println(str1);
    }
}