
package numberscalculation;
import java.util.Scanner;

public class NumbersCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int workoutDuration;

        System.out.println("Welcome to the Fitness App!");
        System.out.println("Enter a workout duration:");

        
        while (true) {
            workoutDuration = scanner.nextInt();
            if (workoutDuration < 0) {
                System.out.println("Exiting the app. Thank you for using the Fitness App!");
                break;
            }

            int primeCaloriesBurned = calculatePrimeCalories(workoutDuration);
            int oddCaloriesBurned = calculateOddCalories(workoutDuration - 1); 
            int evenCaloriesBurned = calculateEvenCalories(workoutDuration - 1); 

      
            System.out.println("Sum of calories burned for prime numbers less than " + workoutDuration + ": " + primeCaloriesBurned);
            System.out.println("Sum of calories burned for odd numbers less than " + workoutDuration + ": " + oddCaloriesBurned);
            System.out.println("Sum of calories burned for even numbers less than " + workoutDuration + ": " + evenCaloriesBurned);
            System.out.println("Enter another workout duration:");
        }

        scanner.close();
    }

    public static int calculatePrimeCalories(int workoutDuration) {
        int caloriesBurned = 0;
        for (int i = 2; i < workoutDuration; i++) {
            if (isPrime(i)) {
                caloriesBurned += i;
            }
        }
        return caloriesBurned;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
   
    public static int calculateOddCalories(int n) {
        if (n <= 0) return 0;
        if (n % 2 != 0) {
            return n + calculateOddCalories(n - 2); 
        }
        return calculateOddCalories(n - 1); 
    }

   
    public static int calculateEvenCalories(int n) {
        if (n <= 0) return 0;
        if (n % 2 == 0) {
            return n + calculateEvenCalories(n - 2); 
        }
        return calculateEvenCalories(n - 1); 
    }
}

        
        
        
        
        
    