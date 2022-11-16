package com.rp.sec01;

import java.util.stream.Stream;

public class Lec01Stream {

    public static void main(String[] args) {
        //Stream are lazy - streams are executed only when terminal operation(consumer) encountered
        Stream<Integer> intStream = Stream.of(1, 2 , 3)
                .map(i -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return i * 2;
                });

       intStream.forEach(i -> System.out.println(i));

    }

}
