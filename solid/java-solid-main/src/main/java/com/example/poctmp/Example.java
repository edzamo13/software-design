package com.example.poctmp;

import java.text.DecimalFormat;

public class Example {


  public String numberToString(Number value) {
    if (value == null) {
      return null;
    }

    System.out.println("value===>" + value);
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    String formattedValue = decimalFormat.format(value);
    System.out.println("formatted value===>" + formattedValue);
    return formattedValue;
  }

  public static void main(String[] args) {
    Example formatter = new Example();
    System.out.println(formatter.numberToString(1.999));  // Ejemplo de uso
  }

}
