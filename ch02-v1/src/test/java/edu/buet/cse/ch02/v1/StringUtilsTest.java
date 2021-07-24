package edu.buet.cse.ch02.v1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringUtilsTest {
  @Test
  public void testForNull() {
    boolean result = StringUtils.isPalindrome(null);
    assertFalse("result is expected to be false", result);
  }

  @Test
  public void testForEmptyString() {
    boolean result = StringUtils.isPalindrome("");
    assertTrue("result is expected to be true", result);
  }

  @Test
  public void testWithStringOfLengthOne() {
    boolean result = StringUtils.isPalindrome("a");
    assertTrue("result is different than expected", result);
  }

  @Test
  public void testWithLongString() {
    boolean result1 = StringUtils.isPalindrome("madamimadam");
    assertTrue("result1 is different than expected", result1);

    boolean result2 = StringUtils.isPalindrome("apple");
    assertFalse("result2 is different than expected", result2);
  }
}
