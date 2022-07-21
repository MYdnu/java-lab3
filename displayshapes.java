package labthree;
/*
   A
   B C
   D E F
   G H I J
   K L M N O
 */

public class displayshapes {
    public static void main(String[] args){

        int N = 5;
        char n = 'A';

        for(int i = 1; i <= N; i++){
            /* for(int k=6;k>=6-1;k--){
                System.out.print(" ");
             }
             */
            for(int j = 1; j <= i; j++){

                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }

    }
    
}
