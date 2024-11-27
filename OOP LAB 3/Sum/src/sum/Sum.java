package sum;
import java.util.Scanner;
public class Sum {


public class SumCalculator {

    public static int ComputeOddSum(int input) {
        if (input <= 0) {
            return 0;
        }
        if (input % 2 != 0) {
            return input + ComputeOddSum(input - 2);
        } else {
            return ComputeOddSum(input - 1);
        }
    }

    public static int ComputeEvenSum(int input) {
        int sum = 0;
        for (int i = 2; i < input; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a number (negative number to quit): ");
                int input = scanner.nextInt();
                
                if (input < 0) {
                    System.out.println("Exiting...");
                    break;
                }
                
                int oddSum = ComputeOddSum(input);
                int evenSum = ComputeEvenSum(input);
                
                System.out.println("Sum of odd numbers less than " + input + " is: " + oddSum);
                System.out.println("Sum of even numbers less than " + input + " is: " + evenSum);
            }
        }
    }
}

   
   
}
