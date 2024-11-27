package Patientinfo;
import java.util.Scanner;
public class PatientInfo {


    // Global variables to store patient details
    String pNumber;
    String pName;
    int pAge;
    String pEmail;
    String pContact;
    String pComplain;
    double pBill;

    // Method to take patient data
    public void Take_Patient_data() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------Patient's Info-------------");
        System.out.print("Enter Patient's Number please: ");
        pNumber = scanner.nextLine();

        System.out.print("Enter Patient's Name please: ");
        pName = scanner.nextLine();

        System.out.print("Enter Patient's age please: ");
        pAge = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter Patient's Email please: ");
        pEmail = scanner.nextLine();

        System.out.print("Enter Patient's Contact please: ");
        pContact = scanner.nextLine();

        System.out.print("Enter Patient's Complain please: ");
        pComplain = scanner.nextLine();

        System.out.print("Enter Patient's Bill please: ");
        pBill = scanner.nextDouble();
    }

    // Method to print patient receipt without using printf
    public void Print_Receipt() {
        System.out.println("\n-------------Patient's Receipt-------------");
        System.out.println("Patient's Number: " + pNumber);
        System.out.println("Patient's Name: " + pName);
        System.out.println("Patient's age: " + pAge);
        System.out.println("Patient's Email: " + pEmail);
        System.out.println("Patient's Contact: " + pContact);
        System.out.println("Patient's Complain: " + pComplain);
        System.out.println("Patient's Bill: " + pBill);
        System.out.println("------------------------------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of the class
        PatientInfo receptionist = new PatientInfo();

        // Take patient data
        receptionist.Take_Patient_data();

        // Print receipt
        receptionist.Print_Receipt();
    }
}

   
    

