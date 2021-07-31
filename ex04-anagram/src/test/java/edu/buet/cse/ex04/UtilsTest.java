package edu.buet.cse.ex04;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilsTest {
  @Test
  public void testForAnagram() {
    assertTrue(Utils.isAnagram("arc", "car"));
    assertTrue(Utils.isAnagram("elbow", "below"));
    assertTrue(Utils.isAnagram("stressed", "desserts"));
  }
}
