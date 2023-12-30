package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Reduce1 {

    public static void main(String[] args) {
        String s = "Ola Gabriel Tudo Bem?";
        String[] split = s.split(" ");
        List<String> listStr = Arrays.asList(split);

        List<Integer> list =  Arrays.asList(1, 2, 3, 4, 5, 6);

        //reduce tem que receber funcao associativa

//        list.stream()
//                .forEach(System.out::println);

      /*  Optional<Integer> soma = list.stream()
                .reduce((n1, n2) -> n1 + n2);

        System.out.println(soma.get());*/

        /*Optional<Integer> multiplicacao = list.stream()
                .reduce((n1, n2) -> n1 * n2);

        System.out.println(multiplicacao.get());*/

//        Optional<String> concatenacao = listStr.stream()
//                .reduce((s1, s2) -> s1.concat(s2));
//
//        System.out.println(concatenacao.get());
//
//// NAO FACA
//        Optional<Integer> subtracao = list.stream()
//                .reduce((n1, n2) -> n1 - n2);
//
//        System.out.println(subtracao.get());
//
//        Integer soma2 = list.stream()
//                .reduce(0, (n1, n2) -> n1 + n2);
//
//        System.out.println(soma2);
//
//        Integer multiplicacao2 = list.stream()
//                .reduce(1, (n1, n2) -> n1 * n2);
//
//        System.out.println(multiplicacao2);
//
//        String concatenacao2 = listStr.stream()
//                .reduce("", (s1, s2) -> s1.concat(s2));
//
//        System.out.println(concatenacao2);

        /*List<Integer> listVazia = Arrays.asList();
        Integer soma2 = listVazia.stream()
                .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(soma2);*/

    /*    OptionalDouble reduce = DoubleStream.of(1.5, 2.9, 6.7)
                .reduce((d1, d2) -> Math.min(d1, d2));
        System.out.println(reduce);*/


       /* double menorValor = DoubleStream.of(1.5, 2.9, 6.7)
                .reduce(Double.POSITIVE_INFINITY, (d1, d2) -> Math.min(d1, d2));
        System.out.println(menorValor);

        Integer soma3 = list.stream()
                .reduce(0, (n1, n2) -> n1 + n2, (n1, n2) -> n1 + n2);

        System.out.println(soma3);

        Optional<String> reduce = list.stream()
                .map(n1 -> n1.toString())
                .reduce((n1, n2) -> n1.concat(n2));

        System.out.println(reduce);*/

        String reduce = list.stream()
                .reduce("",
                        (n1, n2) -> n1.toString().concat(n2.toString()),
                        (n1, n2) -> n1.concat(n2));

        System.out.println(reduce);

    }
}
