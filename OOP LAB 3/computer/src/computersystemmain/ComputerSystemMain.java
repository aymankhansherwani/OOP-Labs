package computersystemmain;

import java.util.Scanner;

class ComputerSystem {

    String name;
    String type;
    String processor;
    String ram;
    String hdd;
    String motherboard;
    String opticalDrive;

    public ComputerSystem() {
        this.name = "Default Name";
        this.type = "Desktop";
        this.processor = "Intel Core i5";
        this.ram = "8GB";
        this.hdd = "1TB";
        this.motherboard = "ASUS";
        this.opticalDrive = "DVD RW";
    }

    public void getDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Computer Name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter Computer Type (Desktop/Laptop): ");
        this.type = scanner.nextLine();

        System.out.print("Enter Processor Specification: ");
        this.processor = scanner.nextLine();

        System.out.print("Enter RAM size: ");
        this.ram = scanner.nextLine();

        System.out.print("Enter Hard Disk Drive (HDD) size: ");
        this.hdd = scanner.nextLine();

        System.out.print("Enter Motherboard: ");
        this.motherboard = scanner.nextLine();

        System.out.print("Enter Optical Drive: ");
        this.opticalDrive = scanner.nextLine();
    }

    public void displayDetails() {
        System.out.println("\nComputer System Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Processor: " + this.processor);
        System.out.println("RAM: " + this.ram);
        System.out.println("HDD: " + this.hdd);
        System.out.println("Motherboard: " + this.motherboard);
        System.out.println("Optical Drive: " + this.opticalDrive);
    }

    public void changeDetails() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        
        System.out.println("\nWould you like to change any details? (yes/no)");
        choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Which detail would you like to change?");
            System.out.println("1. Name");
            System.out.println("2. Type");
            System.out.println("3. Processor");
            System.out.println("4. RAM");
            System.out.println("5. HDD");
            System.out.println("6. Motherboard");
            System.out.println("7. Optical Drive");
            System.out.print("Enter the number corresponding to the detail you want to change: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter new Computer Name: ");
                    this.name = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Enter new Computer Type (Desktop/Laptop): ");
                    this.type = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Enter new Processor Specification: ");
                    this.processor = scanner.nextLine();
                    break;
                case 4:
                    System.out.print("Enter new RAM size: ");
                    this.ram = scanner.nextLine();
                    break;
                case 5:
                    System.out.print("Enter new HDD size: ");
                    this.hdd = scanner.nextLine();
                    break;
                case 6:
                    System.out.print("Enter new Motherboard: ");
                    this.motherboard = scanner.nextLine();
                    break;
                case 7:
                    System.out.print("Enter new Optical Drive: ");
                    this.opticalDrive = scanner.nextLine();
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

public class ComputerSystemMain {
    public static void main(String[] args) {
        ComputerSystem computer = new ComputerSystem();

        computer.getDetails();
        computer.displayDetails();
        computer.changeDetails();
        computer.displayDetails();
    }
}
