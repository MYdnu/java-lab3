package labthree;

import java.util.Scanner;

public class eight {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = in.nextLine();

        String [] wordsArray = str.trim().split(" ");

        System.out.println("The length of string is "+ wordsArray.length);

        for(int i = 0;i < wordsArray.length;i++){

            char [] eachletterinArray = wordsArray[i].toCharArray();

            for(int j =0 ,count = 0;j< eachletterinArray.length;j++){

                if(   (eachletterinArray[j] + 'a'-97>=65 && eachletterinArray[j] + 'a'-97 <=90 )
                    || (eachletterinArray[j] + 'a'-97>=97  && eachletterinArray[j] + 'a'-97 <=122)){

                        count++;

                }

        
            }


        }

    }
    
}
