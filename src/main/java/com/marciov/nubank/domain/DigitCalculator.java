package com.marciov.nubank.domain;

import java.math.BigInteger;

public class DigitCalculator {
    private BigInteger number;
    private Integer digit = 0;
    public Integer getDigit() {
        return digit;
    }

    private int k = 0;

    DigitCalculator(BigInteger number, int k) {
        this.number = number;
        this.k = k <= 0 ? 1 : k;
        caclulateDigit();
    }

    public Integer caclulateDigit() {
        String cNumber = "";
        
        for (int i = 0; i < k; i++) cNumber += String.valueOf(number);

        do {
            digit = 0;
            for (char it : cNumber.toCharArray()) digit += Integer.parseInt(String.valueOf(it));
            cNumber = String.valueOf(digit);
        }
        while (cNumber.length() > 1);
        
        return digit;
    }

}
