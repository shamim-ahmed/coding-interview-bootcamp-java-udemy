package edu.buet.cse.sec03.v1;

public class StringUtils {
  private StringUtils() {}

  /**
   * Reverse the given String
   * @param input a String
   * @return the reversed String or null if the input is null
   */
  public static String reverse(String input) {
    if (input == null || input.length() <= 1) {
      return input;
    }


    char[] data = input.toCharArray();

    for (int i = 0, j = data.length - 1; i < j; i++, j--) {
      char c = data[i];
      data[i] = data[j];
      data[j] = c;
    }

    return String.valueOf(data);
  }
}
