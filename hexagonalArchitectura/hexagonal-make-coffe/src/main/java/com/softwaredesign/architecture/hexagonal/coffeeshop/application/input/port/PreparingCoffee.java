package com.softwaredesign.architecture.hexagonal.coffeeshop.application.input.port;

import java.util.UUID;

public interface PreparingCoffee {
  Order startPreparingOrder(UUID orderId);
  Order finishPreparingOrder(UUID orderId);
}
