package labthree;

import java.util.Scanner;

public class ten {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int um =1;
        for(int i = 1; i <= 10; i++){ 

            for(int j = 1; j <=20; j++){
                
                System.out.printf(" "+"%5d",um*n);
                um++;
            }
            System.out.println();
        }

    }
}
    
