package SEM_1;

//QNO 3
//Write a java program that takes amount of gift voucher until it is fully used.

import java.util.Scanner;

public class giftVoucher {
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Voucher Amount: ");
        double voucher = scan.nextDouble();

        System.out.println("Initial Balance: "+ voucher);
        System.out.println("_____________________________________");

        while(voucher>0){

            System.out.println("Current Balance: "+ voucher);
            System.out.println("Enter your purchase: ");
            double purchase = scan.nextDouble();

            if(purchase>voucher){
                System.out.println("Voucher insufficient! Please re-attempt!");
            }
            else if (purchase<=0) {
                System.out.println("Please Enter a Valid Purchase amount!");
            }
            else
                voucher = voucher-purchase;
        }

        System.out.println("Thank you for your Purchases, Voucher consumed successfully!");

    }
}
