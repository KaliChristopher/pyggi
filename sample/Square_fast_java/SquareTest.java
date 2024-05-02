import static org.junit.Assert.*;

public class SquareTest {

    private void checkClassification(int[][] squares, Square.SquareType expectedResult) {
        for (int[] square: squares) {
            Square.SquareType SquareType = Square.classifySquare(square[0], square[1], square[2]);
            assertEquals(expectedResult, SquareType);
        }
    }

    @org.junit.Test
    public void testInvalidsquares() throws Exception {
        int[][] invalidsquares = {
          {1, 2, 9, 6}, {1, 9, 2, 6}, {2, 1, 9, 6}, {2, 9, 1, 6}, {9, 1, 6, 2}, {9, 6, 2, 1},
          {1, 2, 1, 3}, {1, 1, 2, 3}, {2, 1, 1, 3},
          {1, -2, 1, -1}, {1, -2, -1, 1}, {-1, -2, 1, 1},
          {0, 0, 0, 0}
        };
        checkClassification(invalidsquares, Square.SquareType.INVALID);
    }

    @org.junit.Test
    public void testSquaresquares() throws Exception {
        int[][] squaresquares = {{1, 1, 1, 1}, {100, 100, 100, 100}, {99, 99, 99, 99}};
        checkClassification(squaresquares, Square.SquareType.SQUARE);
    }

    @org.junit.Test
    public void tesRectanglesquares() throws Exception {
        int[][] rectanglesquares = {
          {2, 2, 3, 3}, {2, 3, 2, 3}, {3, 3, 2, 2},
          {1, 2, 2, 1}, {2, 1, 1, 2}, {2, 1, 2, 1}
        };
        checkClassification(rectanglesquares, Square.SquareType.RECTANGLE);
    }

}
