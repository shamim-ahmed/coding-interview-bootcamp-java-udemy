package edu.buet.cse.ex04;

import java.util.TreeMap;

public class Utils {
  private Utils() {}

  /**
   * Simple anagram detector. Does not support spaces
   * 
   * @param str1 a String
   * @param str2 a String
   * @return a boolean
   */
  public static boolean isAnagram(String str1, String str2) {
    if (str1 == null || str2 == null) {
      return false;
    }

    TreeMap<Character, Integer> countMap1 = findCharacterCount(str1);
    TreeMap<Character, Integer> countMap2 = findCharacterCount(str2);

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

  private static TreeMap<Character, Integer> findCharacterCount(String str) {
    char[] data = str.toCharArray();
    TreeMap<Character, Integer> resultMap = new TreeMap<>();

    for (char c : data) {
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
