package org.example;

import java.util.Arrays;
import java.util.List;

public class Lambda3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 8, 9);

        list.stream()
                .peek(n  -> System.out.println(n + "Se inscreva"))
                .filter(n -> n % 2 == 0)
                .peek(n  -> System.out.println(n + "Comente!!"))
                .forEach(System.out::println);

    }

    private static StringBuilder converteParaStringBuilder(Integer n) {
        StringBuilder builder = new StringBuilder();

        builder.append(n);
        builder.append("s");
        builder.append("a");

        return builder;
    }

}
