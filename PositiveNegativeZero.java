import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String args[]) {
        System.out.println("lets find out which number is +ve ,-ve ,0 ");
        System.out.println(" enter your number :");
        Scanner input= new Scanner(System.in);
        int zoro =input.nextInt();
        if( zoro>0){
            System.out.println( "yo zoro your number is +ve");
        }
        else if(zoro<0){
            System.out.println( "your number is -ve");
        }
        else{
            System.out.println("yoo your entered number is neutral");
        }
    }
}

   
    
    
