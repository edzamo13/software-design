package com.architecture.hexagonal.coffeeshop.coffeeshopapplication.application.output.port;

import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.domain.Order;
import java.util.UUID;

public interface Orders {
  Order findOrderById(UUID orderId) throws OrderNotFound;
  Order save(Order order);
  void deleteById(UUID orderId);

}
