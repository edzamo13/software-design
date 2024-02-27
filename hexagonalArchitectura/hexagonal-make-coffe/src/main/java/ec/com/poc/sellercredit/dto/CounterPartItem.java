package ec.com.poc.sellercredit.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CounterPartItem {

  private String identificationValue;
 private String description;


}

