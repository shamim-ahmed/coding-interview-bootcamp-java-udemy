package edu.buet.cse.ex03.v2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilsTest {
  @Test
  public void testForZero() {
    int result = Utils.reverse(0);
    assertEquals("result is different than expected", 0, result);
  }

  @Test
  public void testForSingleDigit() {
    int result = Utils.reverse(7);
    assertEquals("result is different than expected", 7, result);
  }

  @Test
  public void testForMultipleDigits() {
    int result = Utils.reverse(12345);
    assertEquals("result is different than expected", 54321, result);
  }

  @Test
  public void testForNegativeValue() {
    int result = Utils.reverse(-12345);
    assertEquals("result is different than expected", -54321, result);
  }

  @Test
  public void testWithZero() {
    int result = Utils.reverse(-900);
    assertEquals("result is different than expected", -9, result);
  }
}
