package labthree;

import java.util.Scanner;

public class seven {
    public static void main(String[] args){

        int sum = 0,num;

        Scanner in = new Scanner(System.in);
        char opt = 'Y';

        while(opt=='Y'||opt=='y'){
            System.out.print("Enter a number: ");
            num = in.nextInt();
            sum+=num;

            System.out.print("Enter 'Y' if you wish to continue else enter 'N': ");
            opt = in.next().charAt(0);

        }

        System.out.print("Sum of the numbers is :"+sum);

        }

    }
    
