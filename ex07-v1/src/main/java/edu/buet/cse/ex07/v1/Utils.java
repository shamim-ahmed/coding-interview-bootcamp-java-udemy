package edu.buet.cse.ex07.v1;

import java.util.HashMap;
import java.util.Map;

public class Utils {
  private Utils() {}

  /**
   * Anagram detection with spaces and different case
   * 
   * @param str1 a String
   * @param str2 a String
   * @return a boolean
   */
  public static boolean isAnagram(String str1, String str2) {
    if (str1 == null || str2 == null) {
      return false;
    }

    Map<Character, Integer> countMap1 = getCharacterMap(str1);
    Map<Character, Integer> countMap2 = getCharacterMap(str2);

    if (countMap1.size() != countMap2.size()) {
      return false;
    }

    boolean result = true;

    for (Character c : countMap1.keySet()) {
      Integer n1 = countMap1.get(c);
      Integer n2 = countMap2.get(c);

      if (n1 == null || !n1.equals(n2)) {
        result = false;
        break;
      }
    }

    return result;
  }

  private static Map<Character, Integer> getCharacterMap(String str) {
    char[] data = str.toLowerCase().toCharArray();
    Map<Character, Integer> resultMap = new HashMap<>();

    for (char c : data) {
      if (!Character.isAlphabetic(c)) {
        continue;
      }

      Integer n = resultMap.get(c);

      if (n == null) {
        n = 1;
      } else {
        n += 1;
      }

      resultMap.put(c, n);
    }

    return resultMap;
  }
}
