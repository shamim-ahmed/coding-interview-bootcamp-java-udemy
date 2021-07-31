package edu.buet.cse.ex04.v1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilsTest {
  @Test
  public void testWithNull() {
    char c = Utils.maxChar(null);
    assertEquals("maxChar is different than expected", 0, c);
  }

  @Test
  public void testWithEmptyString() {
    char c = Utils.maxChar("");
    assertEquals("maxChar is different than expected", 0, c);
  }

  @Test
  public void testWithWord() {
    char c = Utils.maxChar("aabbbbbbbbbcdeeee");
    assertEquals("maxChar is different than expected", 'b', c);
  }
}
