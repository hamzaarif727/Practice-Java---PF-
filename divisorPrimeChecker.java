package SEM_1;
//QNO 6
//Write a program that takes input a number and print all of its divisors and check whether the
//given number is prime or not.

import java.util.Scanner;

public class divisorPrimeChecker {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a given positive number: ");
        int num = scan.nextInt();

        if(num<=0){
            System.out.print("Invalid, please Re-enter a Positive Nunmber: ");
            num = scan.nextInt();
        }

        int div = 0;
        for (int i =1;i<=num;i++){
            if (num%i==0) {
                System.out.println(i);
                div++;
            }

        }
        System.out.println("_______________________________");

        if (div==2)
            System.out.println(num +" is Prime Number.");
        else
            System.out.println(num+ "is not a Prime Number.");
    }

}
