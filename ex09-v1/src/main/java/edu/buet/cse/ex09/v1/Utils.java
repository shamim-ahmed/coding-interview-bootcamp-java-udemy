package edu.buet.cse.ex09.v1;

public class Utils {
  private Utils() {}

  public static void steps(int n) {
    StringBuilder resultBuilder = new StringBuilder();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (j <= i) {
          resultBuilder.append('#');
        } else {
          resultBuilder.append(' ');
        }
      }

      resultBuilder.append('\n');
    }

    System.out.print(resultBuilder.toString());
  }

  public static void main(String... args) {
    steps(3);
  }
}
