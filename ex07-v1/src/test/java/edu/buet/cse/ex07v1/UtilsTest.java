package edu.buet.cse.ex07v1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.buet.cse.ex07.v1.Utils;

public class UtilsTest {
  @Test
  public void testForAnagram() {
    assertTrue(Utils.isAnagram("Debit card", "Bad credit"));
    assertTrue(Utils.isAnagram("Dormitory",  "Dirty room"));
    assertTrue(Utils.isAnagram("Conversation", "Voices rant on"));
    assertTrue(Utils.isAnagram("elbow", "below"));
    assertTrue(Utils.isAnagram("stressed", "desserts"));
  }
}
