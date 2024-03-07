package com.architecture.hexagonal.coffeeshop.coffeeshopapplication.domain;

import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.domain.enums.Location;
import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.domain.enums.Status;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import lombok.Data;

@Data
public class Order {
  private UUID id = UUID.randomUUID();
  private final Location location;
  private final List<LineItem> items;
  private Status status = Status.PAYMENT_EXPECTED;


  public Order(Location location, List<LineItem> items) {
    this.location = location;
    this.items = items;
  }

  public Order markPaid() {
    if (status != Status.PAYMENT_EXPECTED) {
      throw new IllegalStateException("Order is already paid");
    }
    status = Status.PAID;
    return this;
  }
  public BigDecimal getCost() {
    return items.stream()
        .map(LineItem::getCost)
        .reduce(BigDecimal::add)
        .orElse(BigDecimal.ZERO);
  }

}


