package SEM_1;

//QNO12
//Write a program that takes a positive number and prints its factorial.

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        if (num<=0){
            System.out.print("Invalid, Please re-enter a positive number: ");
            num = scan.nextInt();
        }
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("The factorial is: " +fact);

    }
}
