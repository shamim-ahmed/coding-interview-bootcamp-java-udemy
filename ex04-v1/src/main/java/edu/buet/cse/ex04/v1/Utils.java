package edu.buet.cse.ex04.v1;

import java.util.HashMap;
import java.util.Map;

public class Utils {
  private Utils() {}

  public static char maxChar(String str) {
    if (str == null) {
      return 0;
    }

    Map<Character, Integer> charMap = new HashMap<>();

    char[] data = str.toCharArray();
    int maxValue = 0;
    char maxChar = 0;

    for (char c : data) {
      Integer n = charMap.get(c);

      if (n == null) {
        n = 1;
      } else {
        n += 1;
      }

      charMap.put(c, n);

      if (n > maxValue) {
        maxValue = n;
        maxChar = c;
      }
    }

    return maxChar;
  }
}
