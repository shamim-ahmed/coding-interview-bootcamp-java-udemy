package edu.buet.cse.ex06.v1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class UtilsTest {

  @Test
  public void testArrayChunk() {
    int[][] resultArray1 = Utils.chunk(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 3);
    assertEquals("array chunk result is different than expected", "[[1, 2, 3], [4, 5, 6], [7, 8]]",
        Arrays.deepToString(resultArray1));

    int[][] resultArray2 = Utils.chunk(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 4);
    assertEquals("array chunk result is different than expected", "[[1, 2, 3, 4], [5, 6, 7, 8]]",
        Arrays.deepToString(resultArray2));
  }
}
