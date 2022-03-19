package JAVA;

import java.util.Scanner;

public class Course {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String studentName = "";
        int sessionCode = 0;
        int courseCode = 0;
        int regFee = 0;
        String Session = "";
        String courseDesc = "";
        double courseFee = 0;

        System.out.println("Student Name: ");
        studentName = scanner.nextLine();

        System.out.println("Session Code (1/2): ");
        sessionCode = scanner.nextInt();

        System.out.println("Course Code (50-52): ");
        courseCode = scanner.nextInt();

        System.out.println("Registration Fee(3500 - 9000): ");
        regFee = scanner.nextInt();

        scanner.close();

        if (sessionCode == 1) {
            Session = "Morning";
        } else if (sessionCode == 2) {
            Session = "Afternoon";
        } else {
            Session = "Invalid, (Enter 1 and 2)";
        }

        if (courseCode == 50) {
            courseDesc = "C++";
            courseFee = 7000.00;
        } else if (courseCode == 51) {
            courseDesc = "Java";
            courseFee = 8000.00;
        } else if (courseCode == 52) {
            courseDesc = "Visual Basic";
            courseFee = 9000.00;
        } else {
            courseDesc = "Invalid, (Enter 50, 51 or 52 only)";
        }

        int pctDisc = 0;

        if (regFee < 3500.00) {
            System.out.println("Registration Fee: Invalid");
        } else if (regFee > 9000.00) {
            System.out.println("Registration Fee: Invalid");
        } else {
            if (regFee < 4499.99) {
                pctDisc = 0;
            }

            if (regFee >= 4500.00) {
                pctDisc = 2;
            } else if (regFee < 5499.99) {
                pctDisc = 2;
            }

            if (regFee >= 5500.00) {
                pctDisc = 4;
            } else if (regFee < 6499.99) {
                pctDisc = 4;
            }

            if (regFee >= 6500.00) {
                pctDisc = 6;
            }
        }

        double DiscAmt;
        double TotalBln;

        DiscAmt = courseFee * pctDisc / 100;
        TotalBln = (courseFee - (regFee + DiscAmt));

        System.out.println("Student Name: " + studentName);
        System.out.println("Session Code(1/2): " + Session);
        System.out.println("Course Desc: " + courseDesc);
        System.out.println("Total Balance: " + TotalBln);

    }
}