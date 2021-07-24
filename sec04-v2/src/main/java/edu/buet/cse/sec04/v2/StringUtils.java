package edu.buet.cse.sec04.v2;

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

    for (int i = 0, j = data.length - 1; i < j; i++, j--) {
      char c = data[i];
      data[i] = data[j];
      data[j] = c;
    }

    return String.valueOf(data);
  }

  /**
   * return true if the given string is a palindrome
   * 
   * @param input
   * @return a boolean
   */
  public static boolean isPalindrome(String input) {
    if (input == null) {
      return false;
    }

    if (input.length() <= 1) {
      return true;
    }

    String revStr = reverse(input);

    return input.equals(revStr);
  }
}
