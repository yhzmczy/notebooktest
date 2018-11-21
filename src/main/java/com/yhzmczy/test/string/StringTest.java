package com.yhzmczy.test.string;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringTest {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",","(",")");
        stringJoiner.add("a");
        stringJoiner.add("b");
        stringJoiner.add("c");
        System.out.println(stringJoiner.toString());

        List<String> list = Arrays.asList("apple","banana","orange") ;
        String message = String.join("-", list);
        System.out.println(message);

        System.out.println(String.join("-","apple","banana","orange"));


        List<String> list2 = Arrays.asList("A","B","C","D");
        String result=  list2.stream().collect(Collectors.joining("_"));
        System.out.println(result);

        List<String> list3 = Arrays.asList("A","B","C","D");
        String result3=  list3.stream().collect(Collectors.joining("-","[","]"));
        System.out.println(result3);
    }
}
