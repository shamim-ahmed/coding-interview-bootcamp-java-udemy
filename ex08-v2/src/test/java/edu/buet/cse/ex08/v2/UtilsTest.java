package edu.buet.cse.ex08.v2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilsTest {
  @Test
  public void testCapitalization() {
    String result1 = Utils.capitalize("madam i am adam");
    assertEquals("capitalization result is different than expected", "Madam I Am Adam", result1);

    String result2 = Utils.capitalize("hi there, how is it going?");
    assertEquals("capitalization result is different than expected", "Hi There, How Is It Going?",
        result2);

    String result3 = Utils.capitalize("i love breakfast at bill miller bbq");
    assertEquals("capitalization result is different than expected",
        "I Love Breakfast At Bill Miller Bbq", result3);
  }
}
