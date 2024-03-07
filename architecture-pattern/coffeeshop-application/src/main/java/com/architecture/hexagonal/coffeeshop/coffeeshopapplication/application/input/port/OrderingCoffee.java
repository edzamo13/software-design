package com.architecture.hexagonal.coffeeshop.coffeeshopapplication.application.input.port;

import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.domain.CreditCard;
import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.domain.Order;
import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.domain.Payment;
import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.domain.Receipt;
import java.util.UUID;

public interface OrderingCoffee {
  Order placeOrder(Order order);
  Order updateOrder(UUID orderId, Order order);
  void cancelOrder(UUID orderId);
  Payment payOrder(UUID orderId, CreditCard creditCard);
  Receipt readReceipt(UUID orderId);
  Order takeOrder(UUID orderId);

}
