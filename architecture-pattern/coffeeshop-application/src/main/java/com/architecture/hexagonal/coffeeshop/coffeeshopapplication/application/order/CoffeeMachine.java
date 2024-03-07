package com.architecture.hexagonal.coffeeshop.coffeeshopapplication.application.order;

import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.application.input.port.PreparingCoffee;
import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.application.output.port.Orders;
import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.domain.Order;
import java.util.UUID;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CoffeeMachine implements PreparingCoffee {

  private final Orders orders;




  @Override
  public Order startPreparingOrder(UUID orderId) {
    var order = orders.findOrderById(orderId);

    return orders.save(order.markBeingPrepared());
  }

  @Override
  public Order finishPreparingOrder(UUID orderId) {
    return null;
  }
}
