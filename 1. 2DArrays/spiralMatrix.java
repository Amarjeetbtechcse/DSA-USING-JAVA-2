public class spiralMatrix {
    // Method to print the matrix in spiral order
    public static void printSpiral(int matrix[][]) {
        int m = matrix.length;      // Number of rows
        int n = matrix[0].length;   // Number of columns

        // Define boundaries
        int startRow = 0, startCol = 0;
        int endRow = m - 1, endCol = n - 1;

        // Loop until all rows and columns are covered
        while (startRow <= endRow && startCol <= endCol) {
            // Print the top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Print the right column
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // Print the bottom row (if it's a new row)
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
            }

            // Print the left column (if it's a new column)
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            // Move the boundaries inward
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String[] args) {
        // Define the matrix
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Call the printSpiral method to print the matrix in spiral order
        printSpiral(matrix);
    }
}
