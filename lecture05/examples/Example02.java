package examples;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x = ");
        int x = sc.nextInt();
        System.out.print("Enter y = ");
        int y = sc.nextInt();
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        sc.close();
      
    }
    
}
