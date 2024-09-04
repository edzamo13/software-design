package com.example.poctmp;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class PocNormalize {

  public static void main(String[] args) {
    String[] examples = {
        "CRÉDITO DIRECTO CLUBPYCCA",
        "RODRIGO GERMÁNICO AGAMA JÁCOME",
        "GOBIERNO AUTÓNOMO"
    };

    for (String example : examples) {
      System.out.println(removeAccents(example));
    }

  }
  public static String removeAccents(String input) {
    // Normaliza el string a NFD (Normalization Form Decomposition)
    String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
    // Elimina los caracteres diacríticos utilizando una expresión regular
    Pattern pattern = Pattern.compile("\\p{M}");
    return pattern.matcher(normalized).replaceAll("");
  }

}
