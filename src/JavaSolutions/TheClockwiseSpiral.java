package JavaSolutions;

public class TheClockwiseSpiral {

    private static class Position
    {
        private int row = 0;
        private int col = 0;
        private int val = 1;
    }

    public static int[][] test(int N) {
        int[][] result = new int[N][N];
        int counter = 1;
        int total = N * N;
        int rowLimit = N;
        int columnLimit = N;
        int row = 0, column = 0;
        while (counter <= total) {
            for (int i = column; i < columnLimit; i++) {
                result[row][i] = counter++;
            }
            for (int i = row+1; i < rowLimit; i++) {
                result[i][columnLimit-1] = counter++;
            }
            for (int i = columnLimit-2; i >= column; i--) {
                result[rowLimit-1][i] = counter++;
            }
            for (int i = rowLimit-2; i > row; i--) {
                result[i][column] = counter++;
            }
            row++;
            column++;
            rowLimit--;
            columnLimit--;
        }
        return result;
    }




    public static int[][] createSpiral(int N) {

        Position position = new Position();
        int [][] array =  new int[N][N];

        if(N >= 2)
        {
            while (position.val <= N*N)
            {
                right(array, position);
                down(array, position);
                left(array, position);
                up(array, position);
            }
        }
        else if (N == 1)
        {
            return new int[][] {{1}};
        }
        return array;
    }

    private static void right (int[][] array, Position position)
    {
        int row = position.row;
        int col = position.col;
        int val = position.val;
        int N = array.length;

        while (col <= N-1)
        {
            int current = array[row][col];
            if(current == 0) {
                array[row][col] = val;
                val++;
                col++;
            }
            else break;
        }
        // Move to new start position in array for new direction
        position.row = ++row;
        position.col = --col;
        position.val = val;

    }


    private static void left (int[][] array, Position position)
    {
        int row = position.row;
        int col = position.col;
        int val = position.val;

        while (col >= 0)
        {
            int current = array[row][col];
            if(current == 0) {
                array[row][col] = val;
                val++;
                col--;
            }
            else break;
        }
        // Move to new start position in array for new direction
        position.row = --row;
        position.col = ++col;
        position.val = val;

    }

    private static void down (int[][] array, Position position)
    {
        int row = position.row;
        int col = position.col;
        int val = position.val;
        int N = array.length;

        while (row < N )
        {
            int current = array[row][col];
            if(current == 0)
            {
                array[row][col] = val;
                val++;
                row++;
            }
            else break;

        }
        // Move to new start position in array for new direction
        position.row = --row;
        position.col = --col;
        position.val = val;
    }

    private static void up (int[][] array, Position position)
    {
        int row = position.row;
        int col = position.col;
        int val = position.val;

        int N = array.length;
        while (row >= 0)
        {
            int current = array[row][col];
            if(current == 0) {
                array[row][col] = val;
                val++;
                row--;
            }
            else break;
        }
        // Move to new start position in array for new direction
        position.row = row+1;
        position.col = col+1;
        position.val = val;
    }

}