package com.architecture.hexagonal.coffeeshop.coffeeshopapplication.domain;

import java.util.List;
import java.util.UUID;
import javax.xml.stream.Location;

public class Order {
  private UUID id = UUID.randomUUID();
  private final Location location;
  private final List<LineItem> items;
  private Status status = Status.PAYMENT_EXPECTED;

  public Order markPaid() {
    if (status != Status.PAYMENT_EXPECTED) {
      throw new IllegalStateException("Order is already paid");
    }
    status = Status.PAID;
    return this;
  }

}


