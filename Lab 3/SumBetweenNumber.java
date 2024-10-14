

package sumbetweennumber;
import java.util.Scanner;

public class SumBetweenNumber {

    // Recursive method to calculate the sum of numbers between a and b (inclusive)
    public static int sumBetween(int a, int b) {
        // Base case: If a equals b, return a (or b)
        if (a == b) {
            return a;
        }

        // Recursive case: Add a and call sumBetween for the next number
        return a + sumBetween(a + 1, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first positive integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second positive integer: ");
        int num2 = sc.nextInt();

        // Ensure num1 is less than or equal to num2
        if (num1 > num2) {
            System.out.println("The first number must be less than or equal to the second number.");
        } else {
            // Call the recursive function and display the result
            int result = sumBetween(num1, num2);
            System.out.println("The sum of all numbers between " + num1 + " and " + num2 + " is: " + result);
        }

        sc.close();
    }
}
