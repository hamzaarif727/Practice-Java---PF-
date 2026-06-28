package SEM_1;

//QNO8
//Write a program that takes two integers and print greatest common divisor (GCD) of them by
//using logic of common divisors.

import java.util.Scanner;

public class gcd {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter the 1st number: ");
            int n1 = scan.nextInt();

            System.out.print("Enter the 2nd number: ");
            int n2 = scan.nextInt();
            System.out.println("____________________________");
            int m = Math.min(n1, n2);
            System.out.print("The Greatest common divisor is: ");
            int gcd =1;
            for (int i = 1; i < m; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                }
            }
            System.out.println(gcd);

        }
    }
