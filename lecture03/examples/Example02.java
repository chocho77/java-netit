package examples;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
       System.out.print("Enter a double number : "); 
       Scanner scan = new Scanner(System.in);
       double num1 = scan.nextDouble();
       System.out.println("Num1 = " + num1);
       scan.close();        
    }
    
}
