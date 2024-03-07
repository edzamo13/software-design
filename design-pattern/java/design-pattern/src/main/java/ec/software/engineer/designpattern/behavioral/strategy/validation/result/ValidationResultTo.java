package ec.software.engineer.designpattern.behavioral.strategy.validation.result;

import ec.software.engineer.designpattern.behavioral.strategy.validation.enums.MessageTypeEnum;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;


@Data
@AllArgsConstructor
@Generated
public class ValidationResultTo {


  private final Map<String , List<MessageTo>> mapMessages;

  public ValidationResultTo(String hashFile, List<MessageTo> messages) {
    mapMessages = new ConcurrentHashMap<>();
    mapMessages.put(hashFile, messages);
  }


}
