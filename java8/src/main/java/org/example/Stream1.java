package org.example;

import java.util.Arrays;
import java.util.List;

public class Stream1 {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 5, 5, 8, 8, 9);

//        lista.stream()
//                .skip(2)
//                .forEach(e -> System.out.println(e));

//        lista.stream()
//                .limit(2)
//                .forEach(e -> System.out.println(e));

//        lista.stream()
//                .distinct()
//                .forEach(e -> System.out.println(e));

//        lista.stream()
//                .filter( e -> e % 2 == 0)
//                .forEach(e -> System.out.println(e));

        lista.stream()
                .map( e -> e * 2)
                .forEach(e -> System.out.println(e));

        System.out.println(lista);
    }

}
