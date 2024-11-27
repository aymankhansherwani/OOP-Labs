package product;

import java.util.Scanner;

public class Prodcut {
    public static int multiplyUpTo(int num) {
        if (num == 1) {
            return 1;
        }
        return num * multiplyUpTo(num - 1);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            int result = multiplyUpTo(number);
            
            System.out.println("The result of multiplying all numbers from 1 to " + number + " is: " + result);
        }
    }
}

    
    

