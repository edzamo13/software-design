package ec.com.poc;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.Builder;
import lombok.Data;

public class Example {


  public static void main(String[] args) {
    // Ejemplo: Una lista de números
    List<CreditOrder> creditOrders = Arrays.asList(new CreditOrder.CreditOrderBuilder()
            .sellerCreditOrderItemId("sellerCreditOrderItemId")
            .description("description")
            .status(new Status.StatusBuilder()
                .code("DONE")
                .build())
            .build(),
        new CreditOrder.CreditOrderBuilder()
            .sellerCreditOrderItemId("sellerCreditOrderItemId")
            .description("description")
            .status(new Status.StatusBuilder()
                .code("DONE")
                .build())
            .build(),
        new CreditOrder.CreditOrderBuilder()
            .sellerCreditOrderItemId("sellerCreditOrderItemId")
            .description("description")
            .status(new Status.StatusBuilder()
                .code("DONE")
                .build())
            .build()

    );

    boolean flag = creditOrders.stream()
        .allMatch(creditOrder -> !creditOrder.getStatus().equals("Pending"));
    System.out.println("flag:...." + flag);
    // Crear un HashMap
    Map<String, String> mapElement = creditOrders.stream().distinct().collect(Collectors.toMap(
        k-> k.getStatus().getCode(), // Función para extraer la clave (nombre)
        v-> v.getSellerCreditOrderItemId()
    ));

    System.out.println("mapElement" + mapElement);
    for (Entry<String, String> entry : mapElement.entrySet()) {
      String clave = entry.getKey();
      String valor = entry.getValue();
      System.out.println("Clave: " + clave + ", Valor: " + valor);
    }

  int a=   creditOrders.stream().distinct().collect(Collectors.toMap(
        k-> k.getStatus().getCode(),
        v-> v.getSellerCreditOrderItemId()
    )).size();

    System.out.println("a" + a);



  }


}

@Data
@Builder
class CreditOrder {

  private String sellerCreditOrderItemId;
  private String description;
  private Status status;
}

@Data
@Builder
class Status {

  private String code;
  private String description;

}