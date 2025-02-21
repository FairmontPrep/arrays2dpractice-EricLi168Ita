public class Array {

    // Array should be of format
    // 1 2 3
    // 4 5 6
    // 7 8 9
    public int[][] getRowMajorSquare(int x) {
        int count = 1;
        int[][] a = new int[x][x];
        for (int row = 0; row < x; row++) {
            for (int col = 0; col < x; col++) {
                a[row][col] = count;
                count++;
            }
        }
        return a;
    }

    // Array should be of format
    // 1 4 7
    // 2 5 8
    // 3 6 9
    public int[][] getColumnMajorSquare(int x) {
        int count = 1;
        int[][] a = new int[x][x];
        for (int col = 0; col < x; col++) {
            for (int row = 0; row < x; row++) {
                a[row][col] = count;
                count++;
            }
        }
        return a;
    }

    // Array should be of format (for row=3, column=4):
    // 1  2  3  4
    // 5  6  7  8
    // 9  10 11 12
    public int[][] getRowMajorRectangle(int row, int column) {
        int count = 1;
        int[][] a = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = count;
                count++;
            }
        }
        return a;
    }

    // Array should be of format (for column=4, row=3):
    // 1  4   7   10
    // 2  5   8   11
    // 3  6   9   12
    public int[][] getColumnMajorRectangle(int column, int row) {
        int count = 1;
        int[][] a = new int[row][column];
        for (int c = 0; c < column; c++) {
            for (int r = 0; r < row; r++) {
                a[r][c] = count;
                count++;
            }
        }
        return a;
    }

    // Prints the 2D array such that each value is in a field of width 2,
    // followed by a space, for example:
    //  1  2  3
    //  4  5  6
    // (You do not need to handle three-digit numbers.)
    public void printDouble(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                // "%2d " means: print an integer in a width of 2, then a space
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println(); // New line at the end of each row
        }
    }

    // Test main (optional)
    public static void main(String[] args) {
        Array arr = new Array();

        // Test square row-major
        int[][] rowMajorSquare = arr.getRowMajorSquare(3);
        System.out.println("Row Major Square (3x3):");
        arr.printDouble(rowMajorSquare);

        // Test square column-major
        int[][] colMajorSquare = arr.getColumnMajorSquare(3);
        System.out.println("\nColumn Major Square (3x3):");
        arr.printDouble(colMajorSquare);

        // Test rectangle row-major
        int[][] rowMajorRect = arr.getRowMajorRectangle(3, 4);
        System.out.println("\nRow Major Rectangle (3x4):");
        arr.printDouble(rowMajorRect);

        // Test rectangle column-major
        int[][] colMajorRect = arr.getColumnMajorRectangle(4, 3);
        System.out.println("\nColumn Major Rectangle (4 columns, 3 rows):");
        arr.printDouble(colMajorRect);
    }
}
