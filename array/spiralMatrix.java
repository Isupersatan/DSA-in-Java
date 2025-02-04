import java.util.ArrayList;
import java.util.Scanner;

public class spiralMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // List to store the spiral order
        ArrayList<Integer> spiralOrder = new ArrayList<>();
        
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;

        // To collect the elements in spiral order
        while(rowStart <= rowEnd && colStart <= colEnd) {
            // 1. Top row (left to right)
            for(int col = colStart; col <= colEnd; col++) {
                spiralOrder.add(matrix[rowStart][col]);
            }
            rowStart++;

            // 2. Right column (top to bottom)
            for(int row = rowStart; row <= rowEnd; row++) {
                spiralOrder.add(matrix[row][colEnd]);
            }
            colEnd--;

            // 3. Bottom row (right to left)
            if(rowStart <= rowEnd) {
                for(int col = colEnd; col >= colStart; col--) {
                    spiralOrder.add(matrix[rowEnd][col]);
                }
                rowEnd--;
            }

            // 4. Left column (bottom to top)
            if(colStart <= colEnd) {
                for(int row = rowEnd; row >= rowStart; row--) {
                    spiralOrder.add(matrix[row][colStart]);
                }
                colStart++;
            }
        }

        // Output the spiral order in matrix form
        System.out.println("The Spiral Order Matrix is:");
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                // Print the next element in the spiral order
                if(count < spiralOrder.size()) {
                    System.out.print(spiralOrder.get(count) + " ");
                    count++;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
