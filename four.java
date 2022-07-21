package labthree;

import java.util.Scanner;

public class four {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

         int r , sum = 0,temp;
         
         System.out.print("Enter any number: ");
         int num = input.nextInt();
         temp= num;
         while(num>0){
            r = num%10;
            sum = (sum*10) +r;
            num = num/10;

         }

         if(temp == sum){

            System.out.println("Is PALINDROME");
         }

         else
        System.out.println("Is Not PALINDROME");

    }
    
}
