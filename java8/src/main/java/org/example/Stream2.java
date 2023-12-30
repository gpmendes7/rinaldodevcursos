package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Stream2 {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 5, 5, 8, 8, 9, 2, 2);

//        lista.stream()
//                .limit(3)
//                .map( e -> e * 2)
//                .forEach(e -> System.out.println(e));

//        long count = lista.stream()
//                .filter( e -> e % 2 == 0)
//                .count();
//
//        System.out.println(count);

//        Optional<Integer> min = lista.stream()
//                //.filter( e -> e % 2 == 0)
//                .min(Comparator.naturalOrder());
//
//        System.out.println(min.get());

//        Optional<Integer> max = lista.stream()
//                //.filter( e -> e % 2 == 0)
//                .max(Comparator.naturalOrder());
//
//        System.out.println(max.get());


//        List<Integer> novaLista = lista.stream()
//                .filter( e -> e % 2 == 0)
//                .map(e -> e * 3)
//                .collect(Collectors.toList());

        // System.out.println(novaLista);

//        Map<Boolean, List<Integer>> mapa = lista.stream()
//                .map(e -> e * 3)
//                .collect(Collectors.groupingBy(e -> e % 2 == 0));

//        Map<Integer, List<Integer>> mapa = lista.stream()
//                .collect(Collectors.groupingBy(e -> e % 3));
//
//        System.out.println(mapa);
//
//        String collect = lista.stream()
//                .map(e -> String.valueOf(e))
//                .collect(Collectors.joining());

        String collect = lista.stream()
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining(";"));

        System.out.println(collect);
    }
}
