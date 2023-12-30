package org.example;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Optional1 {
    public static void main(String[] args) {
        String s = "1";
        //String s = "abc";
       /* Optional<Integer> numero = converteEmNumero(s);
        System.out.println(numero);
        System.out.println(numero.isPresent());
        System.out.println(numero.get());
        numero.ifPresent(n -> System.out.println(n));*/

        //Integer numero = converteEmNumero(s).orElse(2);
       // Integer numero = converteEmNumero(s).orElseGet(() -> 2);
       // Integer numero = converteEmNumero(s).orElseThrow(() -> new NullPointerException("Valor Vazio."));
        //System.out.println(numero);

    /*    Optional<Integer> numero = Stream.of(1,2, 3)
                .findFirst();

        System.out.println(numero.get());*/

//        Stream.of(1,2, 3)
//                .findFirst()
//                .ifPresent(n -> System.out.println(n));

        /*Stream.of(1,2, 3)
                .findFirst()
                .ifPresent(System.out::println);*/

        int numero = converteEmNumero(s).orElseThrow(() -> new NullPointerException("Valor Vazio"));
        System.out.println(numero);
    }

//    public static Integer converteEmNumero(String numeroStr) {
//        return Integer.valueOf(numeroStr);
//    }

   /* public static Optional<Integer> converteEmNumero(String numeroStr) {
        try {
            Integer integer = Integer.valueOf(numeroStr);
            return Optional.of(integer);
        } catch (Exception e) {
            return Optional.empty();
            //return null;
        }

        //return Optional.of(null);
        //return Optional.ofNullable(null);
    }*/

    public static OptionalInt converteEmNumero(String numeroStr) {
        try {
            int integer = Integer.parseInt(numeroStr);
            return OptionalInt.of(integer);
        } catch (Exception e) {
            return OptionalInt.empty();
            //return null;
        }

        //return Optional.of(null);
        //return Optional.ofNullable(null);
    }
}
