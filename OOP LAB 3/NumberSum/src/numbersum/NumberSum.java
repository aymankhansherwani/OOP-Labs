package numbersum;
   import java.util.Scanner;

public class NumberSum {


    // Recursive function to compute the sum of numbers between start and end
    public static int sumBetween(int start, int end) {
        if (start > end) {
            return 0;
        }
        return start + sumBetween(start + 1, end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two positive integers from the user
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        // Call the recursive function and get the result
        int result = sumBetween(start, end);

        // Output the result
        System.out.println("The sum of numbers between " + start + " and " + end + " is: " + result);

        scanner.close();
    }
}
