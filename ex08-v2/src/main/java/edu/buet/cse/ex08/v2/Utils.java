package edu.buet.cse.ex08.v2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utils {
  private Utils() {}

  public static String capitalize(String inputStr) {
    if (inputStr == null) {
      return null;
    }

    String[] wordArray = inputStr.split(" ");

    for (int i = 0; i < wordArray.length; i++) {
      String word = wordArray[i];

      if (word.length() == 0) {
        continue;
      }

      wordArray[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    return Stream.of(wordArray).collect(Collectors.joining(" "));
  }
}
