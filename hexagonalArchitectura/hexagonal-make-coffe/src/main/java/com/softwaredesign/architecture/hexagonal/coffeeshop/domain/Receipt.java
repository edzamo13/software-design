package com.softwaredesign.architecture.hexagonal.coffeeshop.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Receipt(BigDecimal amount, LocalDate paid) {

}
