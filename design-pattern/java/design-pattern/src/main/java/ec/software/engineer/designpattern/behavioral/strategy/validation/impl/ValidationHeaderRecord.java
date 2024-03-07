package ec.software.engineer.designpattern.behavioral.strategy.validation.impl;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import ec.software.engineer.designpattern.behavioral.strategy.validation.ValidationFile;
import ec.software.engineer.designpattern.behavioral.strategy.validation.dto.Person;
import ec.software.engineer.designpattern.behavioral.strategy.validation.dto.ValidationStandardFile;
import ec.software.engineer.designpattern.behavioral.strategy.validation.enums.MessageTypeEnum;
import ec.software.engineer.designpattern.behavioral.strategy.validation.exception.ErrorCodeFile;
import ec.software.engineer.designpattern.behavioral.strategy.validation.result.MessageTo;
import ec.software.engineer.designpattern.behavioral.strategy.validation.result.ValidationResultTo;
import java.util.ArrayList;
import java.util.List;
import lombok.Setter;


@Setter
public class ValidationHeaderRecord implements ValidationFile<Person, ValidationResultTo> {

  private List<MessageTo> messages;

  @Override
  public ValidationResultTo validate(Person objectToValidate) {
    messages = new ArrayList<>();
    CsvMapper csvMapper = new CsvMapper();
    CsvSchema csvSchema;
    try {
      csvSchema = csvMapper
          .typedSchemaFor(ValidationStandardFile.class)
          .withHeader();
    } catch (Exception e) {
      e.printStackTrace();
      messages.add(new MessageTo(MessageTypeEnum.ERR, "file validation header", e.getMessage(),
          ErrorCodeFile.FILE_FORMAT_OK));
    }
    return new ValidationResultTo("hash", messages);
  }
}



