import java.util.Scanner;

public class Sum {
    
    public static void main(String[] args) {
        System.out.println("Welcome to our calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        int Total=num1 + num2;
        System.out.print("the sum of "+ num1 + "and" + num2+ "is :"+Total);
    }
}