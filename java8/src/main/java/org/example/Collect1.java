package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Collect1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

       /* List<Integer> collect = list.stream()
                .collect(() -> new ArrayList<>(),
                        (l,e) -> l.add(e),
                (l1, l2) -> l1.addAll(l2));

        System.out.println(list);
        System.out.println(collect);

        List<Integer> collect2 = list.stream()
                .filter((n) -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect2);*/

       /* Set<Integer> collect2 = list.stream()
                .filter((n) -> n % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(collect2);*/

        /*Set<Integer> collect2 = list.stream()
                .filter((n) -> n % 2 == 0)
                .collect(Collectors.toCollection(() -> new TreeSet<>()));
        System.out.println(collect2);*/

        /*List<Integer> collect2 = list.stream()
                .filter((n) -> n % 2 == 0)
                .collect(Collectors.toCollection(() -> new LinkedList<>()));
        System.out.println(collect2);*/

   /*     String join = list.stream()
                .map(n -> n.toString())
                .collect(Collectors.joining());
*/
     /*   String join = list.stream()
                .map(n -> n.toString())
                .collect(Collectors.joining(","));

        System.out.println(join);*/

        Double media =list.stream()
                .collect(Collectors.averagingInt(n -> n.intValue()));

        System.out.println(media);

        Integer soma =list.stream()
                .collect(Collectors.summingInt(n -> n.intValue()));

        System.out.println(soma);

        IntSummaryStatistics stats =list.stream()
                .collect(Collectors.summarizingInt(n -> n.intValue()));

        System.out.println("IntSummaryStatistics: ");
        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());

        Long count = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.counting());
        System.out.println(count);

        list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.maxBy(Comparator.naturalOrder()))
                        .ifPresent(System.out::println);

        Map<Integer, List<Integer>> groupingBy = list.stream()
                .collect(Collectors.groupingBy((n) -> n % 3 ));

        System.out.println(groupingBy);

        Map<Boolean, List<Integer>> partitioningBy = list.stream()
                .collect(Collectors.partitioningBy((n) -> n % 2 == 0));

        System.out.println(partitioningBy);
//
//        Map<Integer, Integer> toMap = list.stream()
//                .collect(Collectors.toMap(n -> n, n -> n * 2));

        Map<Integer, Double> toMap = list.stream()
                .collect(Collectors.toMap(n -> n,
                        n -> Math.pow(n.doubleValue(), 5)));

        System.out.println(toMap);

    }

}
