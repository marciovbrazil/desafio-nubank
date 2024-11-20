package com.marciov.nubank.domain;

import java.util.List;
import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String email;
    private List<DigitCalculator> digits;
}
