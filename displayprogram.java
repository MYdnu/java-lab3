package labthree;

public class displayprogram {
    public static void main(String[] args){

        int N = 5, sum = 0;

        for(int i = 1; i <= N; i++){

            sum = sum + i;

            for(int j = 1; j <= i; j++){

                System.out.print(j +" + ");
            }
            System.out.println("= "+sum);
        }

    }

    
}
