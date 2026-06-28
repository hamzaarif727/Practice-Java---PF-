package SEM_1;

//QNO7
//Write a java program that takes two integer numbers and print all common divisors between
//them.

import java.util.Scanner;

public class divisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int n1 = scan.nextInt();

        System.out.print("Enter the 2nd number: ");
        int n2 = scan.nextInt();
        System.out.println("____________________________");
        int m = Math.min(n1, n2);
        System.out.print("The common divisors are: ");
        for (int i = 1; i < m; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
