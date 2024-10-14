

package factorialcalculation;
import java.util.Scanner;

public class FactorialCalculation {

    // Recursive method to calculate the product of all numbers from 1 to n
    public static int multiplyUpTo(int n) {
        if (n <= 1) { // Base case
            return 1;
        }
        return n * multiplyUpTo(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // Calling the recursive method and displaying the result
        int result = multiplyUpTo(number);
        System.out.println("The product of all numbers from 1 to " + number + " is: " + result);

        sc.close();
    }
}
