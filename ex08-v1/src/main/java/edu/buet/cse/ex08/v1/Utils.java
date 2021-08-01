package edu.buet.cse.ex08.v1;

public class Utils {
  private Utils() {}

  public static String capitalize(String inputStr) {
    if (inputStr == null) {
      return null;
    }

    char[] data = inputStr.toCharArray();
    boolean wordBoundaryFlag = true;

    for (int i = 0; i < data.length; i++) {
      char c = data[i];

      if (c == ' ') {
        wordBoundaryFlag = true;
      } else {
        if (wordBoundaryFlag) {
          data[i] = Character.toUpperCase(c);
          wordBoundaryFlag = false;
        }
      }
    }

    return String.copyValueOf(data);
  }
}
