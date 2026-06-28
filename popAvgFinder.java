package SEM_1;

import java.util.Scanner;

public class popAvgFinder {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of regions: ");
        int n = scan.nextInt();

        long[] pops = new long[n];
        long total= 0;

        for (int i =0;i<n;i++ ){
            System.out.print("Enter the population for region "+ (i+1)+": ");
            pops[i] =scan.nextLong();
            total +=pops[i];

        }

        double avg = total/n;
        System.out.println("The average is: "+ avg);
        System.out.println();

        boolean greater = false;
        for (int i=0;i<n;i++){
            if (pops[i] > avg){
                System.out.println("Region "+(i=1)+" is greater than average.");
                greater = true;
            }
        }
        if (greater==false){
            System.out.println("No region is greater than average.");
        }
    }
}
