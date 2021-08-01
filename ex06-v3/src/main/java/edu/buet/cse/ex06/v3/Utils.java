package edu.buet.cse.ex06.v3;

public class Utils {
  private Utils() {}

  public static int[][] chunk(int[] values, int n) {
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

    return resultArray;
  }
}
