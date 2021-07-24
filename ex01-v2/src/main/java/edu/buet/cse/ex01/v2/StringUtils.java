package edu.buet.cse.ex01.v2;

public class StringUtils {
  private StringUtils() {}

  /**
   * Reverse the given String
   * 
   * @param input a String
   * @return the reversed String or null if the input is null
   */
  public static String reverse(String input) {
    if (input == null || input.length() <= 1) {
      return input;
    }

    char[] data = input.toCharArray();
    StringBuilder resultBuilder = new StringBuilder(data.length);

    for (int i = 0; i < data.length; i++) {
      resultBuilder.append(data[data.length - 1 - i]);
    }

    return resultBuilder.toString();
  }
}
