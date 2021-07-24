package edu.buet.cse.ch02.v1;

public class StringUtils {
  private StringUtils() {}

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

    char[] data = input.toCharArray();
    boolean result = true;

    for (int i = 0, j = data.length - 1; i < j; i++, j--) {
      if (data[i] != data[j]) {
        result = false;
        break;
      }
    }
 
    return result;
  }
}
