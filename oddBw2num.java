package SEM_1;

import java.util.Scanner;

public class oddBw2num {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int n1 = scan.nextInt();

        System.out.print("Enter 2nd number: ");
        int n2 = scan.nextInt();

        int max = Math.max(n1,n2);
        int min = Math.min(n1,n2);

        System.out.print("The numbers are: ");
        for(int i =min;i<max;i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }

    }
}
