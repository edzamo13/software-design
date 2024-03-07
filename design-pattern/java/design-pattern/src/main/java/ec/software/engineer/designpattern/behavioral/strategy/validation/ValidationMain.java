package ec.software.engineer.designpattern.behavioral.strategy.validation;

import ec.software.engineer.designpattern.behavioral.strategy.validation.dto.ValidationStandardFile;
import ec.software.engineer.designpattern.behavioral.strategy.validation.exception.ValidationFileException;
import ec.software.engineer.designpattern.behavioral.strategy.validation.util.DownloadFile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ValidationMain {

  public static void main(String[] args) throws ValidationFileException, IOException {
    String fileBody = DownloadFile.getFileBody();
    //System.out.println("==>" + fileBody);
    //List<ValidationStandardFile> tmp = DownloadFile.getFileTransform(fileBody);

  //  tmp.stream().forEach(System.out::println);

    /*

    ValidationFileRecord record = new ValidationFileRecord();
    List<ValidationResultTo> resultList = new ArrayList<>();
    ValidationResultTo validationResultTo;
    Person person = new Person();
    person.setName("EDWIN");
    person.setSurname("zamora");
    validationResultTo = record.validate(person);
    resultList.add(validationResultTo);

    System.out.println("Validation Done :" + resultList.toString());

    //lisFile.forEach(System.out::println);

    // List<Data> lisFileTwo=  DownloadFileTwo.getFile();
    // lisFileTwo.forEach(System.out::println);

     */

    readTabsFile();
  }

  public static void readTabsFile() {
    String archivo = "campo1\tcampo2\tcampo3\nvalor1\tvalor2\tvalor3\n";
    boolean esValido = validarSeparadores(archivo);

    if (esValido) {
      System.out.println("El archivo utiliza únicamente tabuladores como separadores.");
    } else {
      System.out.println("El archivo no utiliza únicamente tabuladores como separadores.");
    }
  }

  public static boolean validarSeparadores(String archivo) {
    // Dividir el archivo en líneas
    String[] lineas = archivo.split("\n");

    // Iterar sobre cada línea para validar los separadores
    for (String linea : lineas) {
      // Dividir la línea en campos utilizando el separador de tabulador
      String[] campos = linea.split("\t");

      // Si el número de campos no es igual al número de separadores, el archivo no es válido
      if (campos.length > 1 && campos.length - 1 != linea.chars().filter(ch -> ch == '\t').count()) {
        return false;
      }
    }

    return true;
  }

}
