package com.architecture.hexagonal.coffeeshop.coffeeshopapplication.application.order;

import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.application.input.port.OrderingCoffee;
import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.application.output.port.Orders;
import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.application.output.port.Payments;
import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.domain.CreditCard;
import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.domain.Order;
import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.domain.Payment;
import com.architecture.hexagonal.coffeeshop.coffeeshopapplication.domain.Receipt;
import java.time.LocalDate;
import java.util.UUID;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CoffeeShop implements OrderingCoffee {

  private final Orders orders;
  private final Payments payments;
  @Override
  public Order placeOrder(Order order) {
    return null;
  }

  @Override
  public Order updateOrder(UUID orderId, Order order) {
    return null;
  }

  @Override
  public void cancelOrder(UUID orderId) {

  }

  @Override
  public Payment payOrder(UUID orderId, CreditCard creditCard) {
    var order = orders.findOrderById(orderId);

    orders.save(order.markPaid());

    return payments.save(new Payment(orderId, creditCard, LocalDate.now()));
  }

  @Override
  public Receipt readReceipt(UUID orderId) {
    return null;
  }

  @Override
  public Order takeOrder(UUID orderId) {
    return null;
  }
}
