package mtraton.JavaTests;

import mtraton.JavaSolutions.TheClockwiseSpiral;
import org.junit.Assert;
import org.junit.Test;

public class TheClockwiseSpiralTest {

    @Test
    public void arraySizeEquals1() {
        int[][] expected = new int[][]{
                {1}};
        Assert.assertArrayEquals(expected, TheClockwiseSpiral.createSpiral(1));

    }

    @Test
    public void arraySizeEquals2() {
        int[][] expected = new int[][]{
                {1, 2},
                {4, 3}};
        Assert.assertArrayEquals(expected, TheClockwiseSpiral.createSpiral(2));

    }

    @Test
    public void arraySizeEquals3() {
        int[][] expected = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}};
        Assert.assertArrayEquals(expected, TheClockwiseSpiral.createSpiral(3));

    }
    /*
    @Test
    public void maxSize() {
        // TODO: Add testcase that checks maximal size that does not trigger memory exceptions
       TheClockwiseSpiral.createSpiral(10000);
    }
    */


}