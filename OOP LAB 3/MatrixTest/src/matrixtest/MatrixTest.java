package matrixtest;
import java.util.Scanner;
public class MatrixTest {
  

    public static void main(String[] args) {
        // Declare two 3x3 matrices
        try (Scanner scanner = new Scanner(System.in)) {
            // Declare two 3x3 matrices
            int[][] Mat_1 = new int[3][3];
            int[][] Mat_2 = new int[3][3];
            
            // Input values for Mat_1
            System.out.println("Enter values for Mat_1 (3x3):");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Mat_1[i][j] = scanner.nextInt();
                }
            }
            
            // Input values for Mat_2
            System.out.println("Enter values for Mat_2 (3x3):");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Mat_2[i][j] = scanner.nextInt();
                }
            }
            
            // Equation 1: (Mat_1^3) + (Mat_2^2)
            System.out.println("\nResult of (Mat_1^3) + (Mat_2^2):");
            int[][] result1 = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    result1[i][j] = (int) Math.pow(Mat_1[i][j], 3) + (int) Math.pow(Mat_2[i][j], 2);
                    System.out.print(result1[i][j] + "\t");
                }
                System.out.println();
            }
            
            // Equation 2: (Mat_2 - 3)^2
            System.out.println("\nResult of (Mat_2 - 3)^2:");
            int[][] result2 = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    result2[i][j] = (int) Math.pow((Mat_2[i][j] - 3), 2);
                    System.out.print(result2[i][j] + "\t");
                }
                System.out.println();
            }
            
            // Equation 3: (Mat_2 * 5) - (Mat_1 - 2)
            System.out.println("\nResult of (Mat_2 * 5) - (Mat_1 - 2):");
            int[][] result3 = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    result3[i][j] = (Mat_2[i][j] * 5) - (Mat_1[i][j] - 2);
                    System.out.print(result3[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
