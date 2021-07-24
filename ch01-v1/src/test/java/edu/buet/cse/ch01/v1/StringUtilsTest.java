package edu.buet.cse.ch01.v1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class StringUtilsTest {
  @Test
  public void testForNull() {
    String result = StringUtils.reverse(null);
    assertNull("result is expected to be null", result);
  }

  @Test
  public void testForEmptyString() {
    String result = StringUtils.reverse("");
    assertEquals("result is expected to be an empty string", "", result);
  }

  @Test
  public void testWithStringOfLengthOne() {
    String result = StringUtils.reverse("a");
    assertEquals("result is different than expected", "a", result);
  }

  @Test
  public void testWithLongString() {
    String result1 = StringUtils.reverse("This is a test.");
    assertEquals("result1 is different than expected", ".tset a si sihT", result1);

    String result2 = StringUtils.reverse("apple");
    assertEquals("result2 is different than expected", "elppa", result2);

    String result3 = StringUtils.reverse("ball");
    assertEquals("result3 is different than expected", "llab", result3);
  }
}
