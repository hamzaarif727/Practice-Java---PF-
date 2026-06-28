package SEM_1;

//Q no 4
//Write a program that takes populations and print their sum.

import java.util.Scanner;

public class populationSum {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Mention the number of countries to sum: ");
        int n = scan.nextInt();

        System.out.println("___________________________________________");

        int total = 0;
        for(int i=0;i<n;i++){
            System.out.println("Enter the population: ");
            int pop = scan.nextInt();
            total +=pop;
        }
        System.out.println("___________________________________________");
        System.out.println("The sum is: "+ total);
    }
}
