package com.programmers.bullsandcows;

import com.github.javafaker.Faker;
import com.programmers.bullsandcows.engine.io.NumberGenerator;
import com.programmers.bullsandcows.engine.model.Numbers;

import java.util.stream.Stream;

public class FakerNumberGenerator implements NumberGenerator {
    private final Faker faker = new Faker();

    @Override
    public Numbers generate(int count) {
        return new Numbers(
                Stream.generate(() -> faker.number().randomDigitNotZero())
                .limit(count)
                .toArray(Integer[]::new)
        );
    }
}
