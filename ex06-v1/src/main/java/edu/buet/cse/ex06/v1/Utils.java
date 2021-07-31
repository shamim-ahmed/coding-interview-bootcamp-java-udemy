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
      int start = i * n;
      int[] data = new int[n];

      for (int j = 0; j < data.length; j++) {
        data[j] = values[start + j];
      }

      resultList.add(data);
    }

    if (r > 0) {
      int[] data = new int[r];
      for (int i = 0; i < r; i++) {
        data[i] = values[q * n + i];
      }

      resultList.add(data);
    }

    resultList.stream().forEach(a -> System.out.println(Arrays.toString(a)));
  }

  public static void main(String... args) {
    chunk(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 3);
  }
}
