package simplilearnJava;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your choice, 1 for Noodles, 2 for Milkshake, 3 for Fruits, 4 for Coffee:");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Noodles");
            } else if (choice == 2) {
                System.out.println("Milkshake");
            } else if (choice == 3) {
                System.out.println("Fruits");
            } else if (choice == 4) {
                System.out.println("Coffee");
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
