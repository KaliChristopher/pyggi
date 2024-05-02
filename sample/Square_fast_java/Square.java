public class Square {

    public enum SquareType {
        INVALID, SQUARE, RECTANGLE
    }

    public static SquareType classifySquare(int a, int b, int c, int d) {

        delay();

        // Sort the sides so that a <= b <= c
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        if (a > c) {
            int tmp = a;
            a = c;
            c = tmp;
        }

        if (b > c) {
            int tmp = b;
            b = c;
            c = tmp;
        }

        if (a != b && a != c && a != d) {
            return SquareType.INVALID;
        } else if (a == b && b == c && c == a) {
            return SquareType.SQUARE;
        } else {
            return SquareType.RECTANGLE;

    }

    private static void delay() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            // do nothing
        }
    }

}
