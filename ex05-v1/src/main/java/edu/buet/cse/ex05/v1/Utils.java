package edu.buet.cse.ex05.v1;

public class Utils {
  private Utils() {}

  public static void fizzbuzz(int n) {
    for (int i = 1; i <= n; i++) {
      if (i % 15 == 0) {
        System.out.println("fizzbuzz");
      } else if (i % 3 == 0) {
        System.out.println("fizz");
      } else if (i % 5 == 0) {
        System.out.println("buzz");
      } else {
        System.out.println(i);
      }
    }
  }
  
  public static void main(String...args) {
    fizzbuzz(15);
  }
}
