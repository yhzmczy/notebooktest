package com.yhzmczy.test.string;

import java.util.List;
import java.util.stream.Collectors;

public class ObjStringTest {
    public static void main(String[] args) {
//        List<Person> list = Person.getList();
//        System.out.println("--Join person name--");
//        String result = list.stream().map(p -> p.getName()).collect(Collectors.joining());
//        System.out.println(result);
//        result = list.stream().map(p -> p.getName()).collect(Collectors.joining("|"));
//        System.out.println(result);
//        result = list.stream().map(p -> p.getName()).collect(Collectors.joining("-", "[", "]"));
//        System.out.println(result);
//
//        System.out.println("--Join person age--");
//        result = list.stream().map(p -> String.valueOf(p.getAge())).collect(Collectors.joining());
//        System.out.println(result);
//        result = list.stream().map(p -> String.valueOf(p.getAge())).collect(Collectors.joining("|"));
//        System.out.println(result);
//        result = list.stream().map(p -> String.valueOf(p.getAge())).collect(Collectors.joining("-", "[", "]"));
//        System.out.println(result);

//        System.out.println("--Join person name-age--");
//        result = list.stream().map(p -> p.getName() + "-" + p.getAge()).collect(Collectors.joining("|"));
//        System.out.println(result);
//        result = list.stream().map(p -> p.getName() + "-" + p.getAge()).collect(Collectors.joining("|", "[", "]"));
//        System.out.println(result);

        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);

        String s3 = new String("1")+new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);
    }
}
