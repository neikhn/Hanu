package week3;

import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the year: ");
        int year = sc.nextInt();
        sc.close();
        if (year % 4 != 0) {
            System.out.println("The year " + year + " is not a leap year(it has 365 days).");
        } else if (year %4 == 0 && year % 100 != 0) {
            System.out.println("The year " + year + " is a leap year(it has 366 days).");
        } else if (year %4 == 0 && year % 100 != 0 && year % 400 == 0) {
            System.out.println("The year " + year + " is a leap year(it has 366 days).");
        } else {
            System.out.println("The year " + year + " is not a leap year(it has 365 days).");
        }
    }
}
