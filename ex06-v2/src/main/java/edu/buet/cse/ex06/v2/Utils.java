package edu.buet.cse.ex06.v2;

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

    for (int i = 0; i < values.length; i++) {
      if (i % n == 0) {
        if (i == q * n) {
          resultArray[k++] = new int[r];
        } else {
          resultArray[k++] = new int[n];
        }
      }

      int[] data = resultArray[k - 1];
      data[i % n] = values[i];
    }

    return resultArray;
  }
}
