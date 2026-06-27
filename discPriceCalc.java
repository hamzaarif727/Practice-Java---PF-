package SEM_1;

//QNO 2
//Write a program that takes original selling price and discount percentage of a product and
//print discounted price of product.

import java.util.Scanner;

public class discPriceCalc {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Price: ");
        double org = scan.nextDouble();

        System.out.println("Enter the Percentile %: ");
        double per = scan.nextDouble();

    double percent = per/100;
    double disc = org * percent;
    double lastly = org - disc;

        System.out.println("The final discounted price is: "+ lastly);

        scan.close();


    }
}


//PASS

//KEY TAKEAWAY: take everything in double and basically turn everything in your mind into
// code as done in general mathematics.
