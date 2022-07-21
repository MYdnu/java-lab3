package labthree;
      /* * * * * *
           * * * *
             * * *
               * *
                 *
      */

public class displayshapesss {
    public static void main(String[] args){
        int N = 5;

        for(int i = N; i >= 1;i--){

            for(int k = N-1;k >= i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){

                System.out.print('*'+"");
            }
            System.out.println();
        }

    }
    
}
