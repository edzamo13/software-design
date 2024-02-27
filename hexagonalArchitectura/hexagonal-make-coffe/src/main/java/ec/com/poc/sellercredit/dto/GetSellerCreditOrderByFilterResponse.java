package ec.com.poc.sellercredit.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetSellerCreditOrderByFilterResponse {

  private String sellerCreditOrderId;
  private String customerAffiliationId;
  private String customerUserId;
  private String registerDate;
  private String trayOrderId;
  private String customerProductId;
  private UploadType uploadType;
  private SourceProduct sourceProduct;
  private ProcessingType processingType;
  private String expirationDate;
  private String executionDate;
  private CounterPart counterPart;
  private Status status;
  private List<SellerCreditOrderItems> sellerCreditOrderItems = new ArrayList<>();


}

