package labthree;
/*
 *        *
 *      * *
 *    * * *
 *  * * * *
  * * * * *
 */

public class displayshape {
    public static void main(String[] args){

        int n = 6;
        for(int i = 1; i < n; i++){
          
            for(int s = i ; s < n - 1; s++){
                System.out.print(" ");
            }
        

            for(int j = 1;j <= i; j++){
                System.out.print( '*');
            }
            System.out.println("");
        }
    }
    
}
