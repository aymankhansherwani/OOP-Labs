package fibonaccicalculator;
import java.util.Scanner;

public class FibonacciCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate its Fibonacci value:");
        int number = scanner.nextInt();

        int result = calculateFibonacci(number);
        System.out.println("Fibonacci of " + number + " is: " + result);

        scanner.close();
    }

    // Recursive function to calculate the Fibonacci number
    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n; 
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2); 
    }
}
