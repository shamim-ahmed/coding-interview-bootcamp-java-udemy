package edu.buet.cse.ex08.v3;

public class Utils {
  private Utils() {}

  public static String capitalize(String inputStr) {
    if (inputStr == null) {
      return null;
    }

    char[] data = inputStr.toCharArray();
    data[0] = Character.toUpperCase(data[0]);

    for (int i = 1; i < data.length; i++) {
      if (data[i - 1] == ' ') {
        data[i] = Character.toUpperCase(data[i]);
      }
    }

    return String.valueOf(data);
  }
}
