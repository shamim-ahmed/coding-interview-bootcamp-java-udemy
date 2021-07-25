package edu.buet.cse.ex03.v2;

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
    int result = 0;
    int i = Math.abs(n);
    
    while (i > 0) {
      int r = i % 10;
      result = result * 10 + r;
      i /= 10;
    }
    
    if (n < 0) {
      result = -result;
    }
    
    return result;
  }
}
