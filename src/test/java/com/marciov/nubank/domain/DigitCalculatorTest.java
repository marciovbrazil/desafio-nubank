package com.marciov.nubank.domain;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

public class DigitCalculatorTest {
    @Test
    void itShouldReturnTheRightDigit() {
        //given
        BigInteger number = new BigInteger("9875");
        Integer expected = 8;
        //when
        Integer actual = new DigitCalculator(number, 4).getDigit();
        //then
        assert expected == actual;
        
    }
}
