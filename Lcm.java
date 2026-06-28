package SEM_1;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int n1 = scan.nextInt();

        System.out.print("Enter the 2nd number: ");
        int n2= scan.nextInt();

        int m = Math.min(n1,n2);
        int gcd =1;

        for(int i =1; i<m;i++){
            if (n1%i==0 && n2%i==0){
                gcd =i;
            }
        }
        int LCM = (n1*n2)/gcd;

        System.out.println("______________________");
        System.out.println("The Lcm is: "+ LCM);
        System.out.println("______________________");
    }
}
