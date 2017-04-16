import org.junit.Assert;
import org.junit.Test;

public class TheClockwiseSpiralTest {

    TheClockwiseSpiral spiral = new TheClockwiseSpiral();

    @Test
    public void should_test_spiral() {
        int[][] expected = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}};
        print(spiral.createSpiral(3));
        Assert.assertArrayEquals(expected, spiral.createSpiral(3));

    }

    @Test
    public void minimalSpiral() {
        int[][] expected = new int[][]{
                {1, 2},
                {4, 3}};
        Assert.assertArrayEquals(expected, spiral.createSpiral(2));

    }

    @Test
    public void one() {
        int[][] expected = new int[][]{
                {1}};
        Assert.assertArrayEquals(expected, spiral.createSpiral(1));

    }


    public void print(int[][] arr)
    {
        for(int[] row : arr)
        {
            System.out.println();
            for(int col: row)
            {
                System.out.println(col + " ");
            }

        }
    }

}