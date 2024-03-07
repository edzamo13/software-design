package ec.software.engineer.designpattern.behavioral.strategy.validation;

import ec.software.engineer.designpattern.behavioral.strategy.validation.dto.Person;
import ec.software.engineer.designpattern.behavioral.strategy.validation.exception.ValidationFileException;
import ec.software.engineer.designpattern.behavioral.strategy.validation.impl.ValidationFileRecord;
import ec.software.engineer.designpattern.behavioral.strategy.validation.impl.ValidationHeaderRecord;
import ec.software.engineer.designpattern.behavioral.strategy.validation.result.ValidationResultTo;
import ec.software.engineer.designpattern.behavioral.strategy.validation.util.DownloadFile;
import ec.software.engineer.designpattern.behavioral.strategy.validation.util.DownloadFileTwo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ValidationServiceMain {

  public static void main(String[] args) throws ValidationFileException, IOException {

   // DownloadFile.getFileBody("");
    ValidationFileRecord record = new ValidationFileRecord();
    ValidationHeaderRecord headerRecord = new ValidationHeaderRecord();
    List<ValidationResultTo> resultList = new ArrayList<>();
    ValidationResultTo validationResultTo;

    //validationResultTo = record.validate(person);
   // resultList.add(validationResultTo);

    System.out.println("Validation Done :" + resultList.toString());

   // List<ValidationStandardFile> lisFile=  DownloadFile.getFile();
    //lisFile.forEach(System.out::println);

   // List<Data> lisFileTwo=  DownloadFileTwo.getFile();
   // lisFileTwo.forEach(System.out::println);
  }
}
