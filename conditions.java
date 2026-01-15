import java.util.*;

public class conditions {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        String name=sc.nextLine();
        System.out.println(name);
    
        if(age>=18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cannot vote");
        }

    }
}

 