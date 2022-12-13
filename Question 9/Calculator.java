package letmecalculate;

import java.util.Scanner;

public class Calculator {
    public static void addition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition :"); 
        System.out.print("Enter the first number: ");  
        int x=sc.nextInt();  
        System.out.print("Enter the second number: ");  
        int y=sc.nextInt();    
        System.out.println("Sum is "+(x+y)); 
    }
    public static void subtraction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Subtraction :"); 
        System.out.print("Enter the first number: ");  
        int x=sc.nextInt();  
        System.out.print("Enter the second number: ");  
        int y=sc.nextInt();    
        System.out.println("Difference is "+(x-y)); 
    }
    public static void multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Multiplication :"); 
        System.out.print("Enter the first number: ");  
        int x=sc.nextInt();  
        System.out.print("Enter the second number: ");  
        int y=sc.nextInt();    
        System.out.println("Product is "+(x*y)); 
    }
    public static void division() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Division :"); 
        System.out.print("Enter the first number: ");  
        int x=sc.nextInt();  
        System.out.print("Enter the second number: ");  
        int y=sc.nextInt();    
        System.out.println("Quotient is "+(x/y)); 
    }
}


// In terminal type : javac -d . Calculator.java