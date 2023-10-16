package com.softwaredesign.architecture.hexagonal.coffeeshop.application.output.port;

import java.util.UUID;

public interface Payments {

  Payment findPaymentByOrderId(UUID orderId);
  Payment save(Payment payment);
}
