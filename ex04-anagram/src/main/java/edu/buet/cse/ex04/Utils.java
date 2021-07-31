package edu.buet.cse.ex04;

import java.util.Arrays;

public class Utils {
  private Utils() {}

  /**
   * Simple anagram detector. Does not support spaces
   * @param str1 a String
   * @param str2 a String
   * @return a boolean 
   */
  public static boolean isAnagram(String str1, String str2) {
    if (str1 == null || str2 == null) {
      return false;
    }

    char[] data1 = str1.toCharArray();
    char[] data2 = str2.toCharArray();

    Arrays.sort(data1);
    Arrays.sort(data2);

    return Arrays.equals(data1, data2);
  }
}
