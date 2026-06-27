package SEM_1;

//Q no: 1
//Write a program that takes obtained marks and total marks from the user and print
//percentage.

import java.util.Scanner;

public class percentageCalc {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the obtained marks: ");
        double obt = scan.nextDouble();

        System.out.println(" Enter the total marks: ");
        double total = scan.nextDouble();

        double percentage = (obt /total) * 100;

        System.out.println("The percentage is: " + percentage);

        scan.close();

    }

}

//PASS

// Key takeaway: use double datatypes for inputs and the storing variable.