package org.example;

import java.util.Arrays;
import java.util.List;

public class Lambda1 {
    public static void main(String[] args) {
       /* new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world!");
            }
        }).run();*/

        //new Thread(() -> System.out.println("Olá mundo!")).run();

//        JButton jbutton  = new JButton();
//        jbutton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Olá mundo!");
//            }
//        });
//
//        JButton jbutton2  = new JButton();
//        jbutton2.addActionListener(e -> System.out.println("Olá mundo!"));

        List<Integer> asList = Arrays.asList(1, 2, 3, 4);

//        for(Iterator iterator = asList.iterator(); iterator.hasNext();) {
//            Integer integer = (Integer) iterator.next();
//        }
//
//        for(Integer integer : asList) {
//            System.out.println(integer);
//        }

        //asList.forEach(e -> System.out.println(e));

       /* asList.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer e) {
                        return e % 2 == 0;
                    }
                })
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer e) {
                        System.out.println(e);
                    }
                });*/

//        asList.stream()
//                .filter(e -> e %2 == 0)
//                .forEach(e -> System.out.println(e));

    }
}