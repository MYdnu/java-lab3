package labthree;

import java.util.Scanner;

public class five {
    public static void main(String[] args){
        
        try (Scanner input = new Scanner(System.in)) {
            int num, factorial = 1;

            System.out.print("Enter a number: ");

            num = input.nextInt();
            for(int i = 1; i <= num; i++){

                factorial = i*factorial;
            }

            System.out.print("The factorial of "+num+" is "+factorial);
        }
        
    }
    
}
