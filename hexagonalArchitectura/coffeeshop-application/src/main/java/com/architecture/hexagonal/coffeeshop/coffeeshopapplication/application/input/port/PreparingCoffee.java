package com.architecture.hexagonal.coffeeshop.coffeeshopapplication.application.input.port;

import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.domain.Order;
import java.util.UUID;

public interface PreparingCoffee {
  Order startPreparingOrder(UUID orderId);
  Order finishPreparingOrder(UUID orderId);
}
