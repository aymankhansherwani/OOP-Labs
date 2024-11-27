package first_exercise;
import java.util.Scanner;


public class First_Exercise  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of cookies produced: ");
        int totalCookies = scanner.nextInt();

        int cookiesPerBox = 12;
        double pricePerBox = 1.14;
        int boxesPerCarton = 24;
        double priceLeftoverBox = 0.57;

        int totalBoxes = totalCookies / cookiesPerBox;
        int totalCartons = totalBoxes / boxesPerCarton;
        int leftoverBoxes = totalBoxes % boxesPerCarton;
        int remainingCookies = totalCookies % cookiesPerBox;

        double moneyFromFullBoxes = (totalBoxes - leftoverBoxes) * pricePerBox;
        double moneyFromLeftoverBoxes = leftoverBoxes * priceLeftoverBox;
        double totalMoneyMade = moneyFromFullBoxes + moneyFromLeftoverBoxes;

        System.out.println("Total number of boxes: " + totalBoxes);
        System.out.println("Total number of cartons: " + totalCartons);
        System.out.println("Number of leftover boxes: " + leftoverBoxes);
        System.out.println("Number of remaining cookies (given away for free): " + remainingCookies);
        System.out.println("Total money made: $" + String.format("%.2f", totalMoneyMade));

        scanner.close();
    }
}
