package ec.com.poc.sellercredit;

import ec.com.poc.sellercredit.dto.Beneficiary;
import ec.com.poc.sellercredit.dto.CounterPart;
import ec.com.poc.sellercredit.dto.CounterPartItem;
import ec.com.poc.sellercredit.dto.Currency;
import ec.com.poc.sellercredit.dto.DestinationProduct;
import ec.com.poc.sellercredit.dto.GetSellerCreditOrderByFilterResponse;
import ec.com.poc.sellercredit.dto.PaymentMethod;
import ec.com.poc.sellercredit.dto.ProcessingType;
import ec.com.poc.sellercredit.dto.ProductType;
import ec.com.poc.sellercredit.dto.SellerCreditOrderItems;
import ec.com.poc.sellercredit.dto.SourceProduct;
import ec.com.poc.sellercredit.dto.Status;
import ec.com.poc.sellercredit.dto.UploadType;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class TestSellerCredit {


  public static void main(String[] args) {

    GetSellerCreditOrderByFilterResponse getSellerCreditOrderByFilterResponse = getGetSellerCreditOrderByFilterResponse();
    System.out.println("---");
    //validationPendingImprove(getSellerCreditOrderByFilterResponse);
    GetSellerCreditOrderByFilterResponse tmp = validationPending(
        getSellerCreditOrderByFilterResponse);

    System.out.println("---" + tmp);

  }

  private static GetSellerCreditOrderByFilterResponse getGetSellerCreditOrderByFilterResponse() {
    return GetSellerCreditOrderByFilterResponse.builder()
        .sellerCreditOrderId("12345678-eb18-432b-a9ac-0aa5e80ebe9a")
        .customerAffiliationId("qwerccf-a60b-45e8-b5e3-215924834e5")
        .customerUserId("qwerccf-a60b-45e8-b5e3-215924834e5")
        .registerDate(LocalDate.now().toString())
        .trayOrderId("14621")
        .customerProductId("11073D363-E6D9-4701-AA19-00E1B3DB5613")
        .uploadType(UploadType.builder().code("MASIVA").description("Carga por archivo").build())
        .sourceProduct(SourceProduct.builder()
            .productNumber("50123098678")
            .productType(ProductType.builder().code("0001").description("AHORRO").build())
            .currency(Currency.builder().code("USD").description("Dollar USD").build())
            .build())
        .processingType(ProcessingType.builder().code("IMMEDIATE").build())
        .executionDate("2023-10-26")
        .expirationDate("2023-10-26")
        .counterPart(CounterPart.builder()
            .description("NOMBRE ARCHIVO").identificationValue("CARGA_FACTURAS_JULIO.XLSX").build())
        .status(Status.builder().code("PENDING").build())
        .sellerCreditOrderItems(Arrays.asList(SellerCreditOrderItems.builder()
                .sellerCreditOrderItemId("8e5bb518-bad8-4c63-8455-057d82ee1e17")
                .amount(new BigDecimal(1000))
                .currency(Currency.builder().code("USD").description("Dollar USD").build())
                .status(Status.builder().code("PENDING").build())//SUCCEEDED//FAIL
                .beneficiary(Beneficiary.builder().fullName("Jesus Alberto").documentType("0001")
                    .documentNumber("2100080794").email("email@email.com").build())
                .destinationProduct(DestinationProduct.builder()
                    .productNumber("2100080794")
                    .productType(ProductType.builder().code("0001").description("AHORRO").build())
                    .build())
                .counterPart(
                    CounterPartItem.builder().identificationValue("220292091")
                        .description("Description").build())
                .paymentMethod(PaymentMethod.builder().code("1").description("Pago Online").build())
                .build(),
            SellerCreditOrderItems.builder()
                .sellerCreditOrderItemId("8e5bb518-bad8-4c63-8455-057d82ee1e19")
                .amount(new BigDecimal(1000))
                .currency(Currency.builder().code("USD").description("Dollar USD").build())
                .status(Status.builder().code("SUCCEEDED").build())//SUCCEEDED
                .beneficiary(Beneficiary.builder().fullName("Miguel Alberto").documentType("0001")
                    .documentNumber("2100080794").email("email@email.com").build())
                .destinationProduct(DestinationProduct.builder()
                    .productNumber("2100080794")
                    .productType(ProductType.builder().code("0001").description("AHORRO").build())
                    .build())
                .counterPart(
                    CounterPartItem.builder().identificationValue("220292091")
                        .description("Description").build())
                .paymentMethod(PaymentMethod.builder().code("1").description("Pago Online").build())
                .build()
        )).build();
  }


  private static GetSellerCreditOrderByFilterResponse validationPending(
      GetSellerCreditOrderByFilterResponse getSellerCreditOrderByFilterResponse) {
    boolean flag = getSellerCreditOrderByFilterResponse.getSellerCreditOrderItems()
        .stream()
        .noneMatch(sellerCreditOrderItems -> sellerCreditOrderItems.getStatus().getCode()
            .equals("PENDING"));
    if (flag == true) {
      HashSet<String> mapStatus = new HashSet<String>();
      getSellerCreditOrderByFilterResponse.getSellerCreditOrderItems()
          .forEach(item -> mapStatus.add(item.getStatus().getCode()));
      if (mapStatus.size() == 1) {
        getSellerCreditOrderByFilterResponse.getStatus()
            .setCode(mapStatus.stream().findFirst().get());
        return getSellerCreditOrderByFilterResponse;
      } else if (mapStatus.size() > 1) {
        getSellerCreditOrderByFilterResponse.getStatus()
            .setCode("TO_PARTIALLY_SUCCESSFUL");
        return getSellerCreditOrderByFilterResponse;
      }
    } else {
      return GetSellerCreditOrderByFilterResponse.builder().build();
    }
    System.out.println("----------------");
    System.out.println("look !.." + getSellerCreditOrderByFilterResponse);
    return getSellerCreditOrderByFilterResponse;
  }

  private static GetSellerCreditOrderByFilterResponse validationPendingImprove(
      GetSellerCreditOrderByFilterResponse getSellerCreditOrderByFilterResponse) {

    Boolean flag = getSellerCreditOrderByFilterResponse.getSellerCreditOrderItems()
        .stream()
        .allMatch(sellerCreditOrderItems -> !sellerCreditOrderItems.getStatus().getCode()
            .equals("PENDING"));
    if (flag == true) {
      System.out.println("paso" + getSellerCreditOrderByFilterResponse.getSellerCreditOrderItems());

      HashSet<String> hset = new HashSet<String>();
      getSellerCreditOrderByFilterResponse.getSellerCreditOrderItems().stream()
          .forEach(sellerCreditOrderItems -> {
            // HashSet declaration
            hset.add(sellerCreditOrderItems.getStatus().getCode());
          });

      System.out.println("***" + hset.stream().findFirst().get());
    }

    /*
      System.out.println("**********" + mapStatus.size());
      if (mapStatus.size() == 1) {
        String key = "";
        String value = "";
        for (Entry<String, String> entry : mapStatus.entrySet()) {
          key = entry.getKey();
          value = entry.getValue();

          System.out.println("Validation: {} key: {} value: ." + key + " - " + value);
          getSellerCreditOrderByFilterResponse.getStatus().setCode(key);
        }
        return getSellerCreditOrderByFilterResponse;
      } else if (mapStatus.size() >= 1) {

        getSellerCreditOrderByFilterResponse.getStatus()
            .setCode("TO_PARTIALLY_SUCCESSFUL");
        return getSellerCreditOrderByFilterResponse;
      }

    } else {
      return null;
    }*/
    // System.out.println("look !.." + getSellerCreditOrderByFilterResponse);
    return getSellerCreditOrderByFilterResponse;
  }

}
