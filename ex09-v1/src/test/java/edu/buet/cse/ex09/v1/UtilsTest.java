package edu.buet.cse.ex09.v1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilsTest {
  @Test
  public void testStepsOutput() {
    String result = Utils.steps(3);
    assertEquals("#  \n## \n###\n", result);
  }
}
