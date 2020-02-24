package com.bobkubista.oddoreven;

import java.util.stream.IntStream;

public class OddOrEven {

    public boolean isEven(int[] numbers) {
        if (numbers.length == 0) {
            return true;
        } else {
            return IntStream.of(numbers).sum() % 2 == 0;
        }
    }
}
