package ec.software.engineer.designpattern.behavioral.strategy.validation.impl;

import ec.software.engineer.designpattern.behavioral.strategy.validation.ValidationFile;
import ec.software.engineer.designpattern.behavioral.strategy.validation.dto.ComplexUserDto;
import ec.software.engineer.designpattern.behavioral.strategy.validation.dto.Person;
import ec.software.engineer.designpattern.behavioral.strategy.validation.enums.MessageTypeEnum;
import ec.software.engineer.designpattern.behavioral.strategy.validation.exception.ErrorCodeFile;
import ec.software.engineer.designpattern.behavioral.strategy.validation.exception.ValidationFileException;
import ec.software.engineer.designpattern.behavioral.strategy.validation.result.MessageTo;
import ec.software.engineer.designpattern.behavioral.strategy.validation.result.ValidationResultTo;
import java.util.ArrayList;
import java.util.List;
import lombok.Setter;


@Setter
public class ValidationFileRecord implements ValidationFile<Person, ValidationResultTo> {

  private List<MessageTo> messages;

  @Override
  public ValidationResultTo validate(Person objectToValidate) throws ValidationFileException {
//wherever validation
    messages= new ArrayList<>();
    if (objectToValidate.getName().equals(objectToValidate.getName().toUpperCase())) {
      messages.add(new MessageTo(MessageTypeEnum.INF, "path","", ErrorCodeFile.FILE_FORMAT_OK));
    }
    if (objectToValidate.getSurname().equals(objectToValidate.getSurname().toLowerCase())) {
      messages.add(new MessageTo(MessageTypeEnum.ERR, "path","", ErrorCodeFile.FILE_FORMAT));
    }
    return new ValidationResultTo("hash", messages);
  }


}
