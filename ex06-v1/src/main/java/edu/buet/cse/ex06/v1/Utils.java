package edu.buet.cse.ex06.v1;

public class Utils {
  private Utils() {}

  public static int[][] chunk(int[] values, int n) {
    int[][] resultArray = null;
    int q = values.length / n;
    int r = values.length % n;

    if (r > 0) {
      resultArray = new int[q + 1][];
    } else {
      resultArray = new int[q][];
    }

    for (int i = 0; i < q; i++) {
      int startIndex = i * n;
      resultArray[i] = copyValues(values, startIndex, n);
    }

    if (r > 0) {
      int startIndex = q * n;
      resultArray[q] = copyValues(values, startIndex, r);
    }

    return resultArray;
  }

  private static int[] copyValues(int[] source, int sourceIndex, int count) {
    int[] data = new int[count];

    for (int j = 0; j < data.length; j++) {
      data[j] = source[sourceIndex + j];
    }

    return data;
  }
}
