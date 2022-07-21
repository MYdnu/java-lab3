package labthree;

public class six {

    public static void main(String[] args){
    
        float sum= 1,i;
        
        for( i = 2; i <= 100;i+=2){
        
            sum+= 1/i;
        }
        System.out.printf("%.3f",sum);
    
    }
}
