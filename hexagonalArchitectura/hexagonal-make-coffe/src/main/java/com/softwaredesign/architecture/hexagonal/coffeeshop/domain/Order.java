package com.softwaredesign.architecture.hexagonal.coffeeshop.domain;

import java.util.List;
import java.util.UUID;

public class Order {
  private UUID id = UUID.randomUUID();
  private final Location location;
  private final List<LineItem> items;
  private Status status = Status.PAYMENT_EXPECTED;

}


