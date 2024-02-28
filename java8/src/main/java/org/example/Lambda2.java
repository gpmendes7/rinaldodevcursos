package org.example;

import java.util.stream.IntStream;

public class Lambda2 {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Se inscreva no canal!");

        IntStream.range(0,5)
                .filter((int n) -> n % 2 == 0)
                .reduce((n1, n2) -> n1 + n2)
                .ifPresent(System.out::println);

        IntStream.range(0, 5)
                .filter(n -> {
                    System.out.println("Se inscreva no canal!");
                    return n % 2 == 0;
                })
                .forEach(n -> System.out.println(n));
    }

}
