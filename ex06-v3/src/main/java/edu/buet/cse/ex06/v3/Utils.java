package edu.buet.cse.ex06.v3;

import java.util.Arrays;

public class Utils {
  private Utils() {}

  public static void chunk(int[] values, int n) {
    int q = values.length / n;
    int r = values.length % n;
    int[][] resultArray;

    if (r > 0) {
      resultArray = new int[q + 1][];
    } else {
      resultArray = new int[q][];
    }

    int k = 0;
    int i = 0;

    while (i < values.length) {
      int count;

      if (i == q * n) {
        count = r;
      } else {
        count = n;
      }

      int[] data = new int[count];
      System.arraycopy(values, i, data, 0, count);
      resultArray[k++] = data;
      i += count;
    }

    System.out.println(Arrays.deepToString(resultArray));
  }

  public static void main(String... args) {
    chunk(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 3);
  }
}
