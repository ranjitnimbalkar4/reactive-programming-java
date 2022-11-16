package com.rp.sec01;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import reactor.core.publisher.Mono;

import java.util.Locale;

public class Lec01MonoJust {

    public static void main(String[] args) {

        Address address = Faker.instance().address();

        // Mono = publisher : nothing will will happen unit subscription for publisher
        Mono<Address> addressMono = Mono.just(address);

        addressMono.map(add -> add.fullAddress().toUpperCase(Locale.ROOT))
                .subscribe(a -> System.out.println(a));

    }

}
