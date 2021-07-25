package edu.buet.cse.ex03.v1;

public class Utils {
  private Utils() {}
  
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
   * Reverse a given int value
   * @param n
   * @return an int
   */
  public static int reverse(final int n) {
    String valueStr = Integer.toString(Math.abs(n));
    String revStr = reverse(valueStr);
    int result = Integer.valueOf(revStr);
    
    if (n < 0) {
      result = -result;
    }
    
    return result;
  }
}
