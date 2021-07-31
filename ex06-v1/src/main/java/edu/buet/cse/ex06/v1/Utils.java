package edu.buet.cse.ex06.v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {
  private Utils() {}

  public static void chunk(int[] values, int n) {
    List<int[]> resultList = new ArrayList<>();
    int q = values.length / n;
    int r = values.length % n;

    for (int i = 0; i < q; i++) {
      int startIndex = i * n;
      int[] data = copyValues(values, startIndex, n);
      resultList.add(data);
    }

    if (r > 0) {
      int startIndex = q * n;
      int[] data = copyValues(values, startIndex, r);
      resultList.add(data);
    }

    resultList.stream().forEach(a -> System.out.println(Arrays.toString(a)));
  }

  private static int[] copyValues(int[] source, int sourceIndex, int count) {
    int[] data = new int[count];

    for (int j = 0; j < data.length; j++) {
      data[j] = source[sourceIndex + j];
    }

    return data;
  }

  public static void main(String... args) {
    chunk(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 3);
  }
}
