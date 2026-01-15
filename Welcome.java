import java.util.Scanner;
public class Welcome {
    public static void main(String[] args){

    System.out.println(" who is the greatest swordsman in the world: ");

    Scanner input =new Scanner(System.in);
    String name=input.nextLine();
    System.out.print(" The pirate hunter ,the  greatest swordsman in the world is, the king of hell " +  name);
    System.out.println( name + " what is your age");
    int age=input.nextInt();
    System.out.println(name  + "is"   +   age +   "years old");
    



    
    }
    
}
