package edu.buet.cse.ex09.v2;

public class Utils {
  private Utils() {}

  public static void steps(int n) {
    compute(n, 0, "");
  }

  private static void compute(int n, int row, String str) {
    if (row >= n) {
      return;
    }

    int column = str.length();

    if (column == n) {
      System.out.println(str);
      compute(n, row + 1, "");
      return;
    }

    String tmp = null;

    if (column <= row) {
      tmp = str + "#";
    } else {
      tmp = str + " ";
    }

    compute(n, row, tmp);
  }

  public static void main(String... args) {
    steps(3);
  }
}
