

package matrixcalculation;
import java.util.Scanner;

public class MatrixCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define two 3x3 matrices
        int[][] Mat_1 = new int[3][3];
        int[][] Mat_2 = new int[3][3];
        int[][] result = new int[3][3]; // For storing results
        
        // Input values for Mat_1
        System.out.println("Enter values for Mat_1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Mat_1[i][j] = sc.nextInt();
            }
        }

        // Input values for Mat_2
        System.out.println("Enter values for Mat_2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Mat_2[i][j] = sc.nextInt();
            }
        }

        // First operation: (Mat_1^3) + (Mat_2^2)
        // First, calculate Mat_1^3 (Mat_1 cubed)
        int[][] Mat_1_cubed = new int[3][3];
        multiplyMatrices(Mat_1, Mat_1, Mat_1_cubed);
        multiplyMatrices(Mat_1_cubed, Mat_1, Mat_1_cubed);
        
        // Calculate Mat_2^2 (Mat_2 squared)
        int[][] Mat_2_squared = new int[3][3];
        multiplyMatrices(Mat_2, Mat_2, Mat_2_squared);
        
        // Add Mat_1^3 and Mat_2^2
        System.out.println("(Mat_1^3) + (Mat_2^2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = Mat_1_cubed[i][j] + Mat_2_squared[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // Second operation: (Mat_2 - 3)^2
        int[][] Mat_2_minus_3 = new int[3][3];
        System.out.println("(Mat_2 - 3)^2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Mat_2_minus_3[i][j] = Mat_2[i][j] - 3;
            }
        }
        
        // Square the result (Mat_2 - 3)^2
        int[][] Mat_2_minus_3_squared = new int[3][3];
        multiplyMatrices(Mat_2_minus_3, Mat_2_minus_3, Mat_2_minus_3_squared);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Mat_2_minus_3_squared[i][j] + " ");
            }
            System.out.println();
        }

        // Third operation: (Mat_2^5) - (Mat_1 - 2)
        int[][] Mat_2_fifth = new int[3][3];
        multiplyMatrices(Mat_2_squared, Mat_2, Mat_2_fifth);
        multiplyMatrices(Mat_2_fifth, Mat_2, Mat_2_fifth);
        
        System.out.println("(Mat_2^5) - (Mat_1 - 2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = Mat_2_fifth[i][j] - (Mat_1[i][j] - 2);
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    // Simplified matrix multiplication helper function
    public static void multiplyMatrices(int[][] mat1, int[][] mat2, int[][] result) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = 0; // Reset before calculating
                for (int k = 0; k < 3; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
    }
}


    

