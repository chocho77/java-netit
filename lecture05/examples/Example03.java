package examples;

import java.util.Scanner;

public class Example03 {
    public static int getDecimal(int binary) {
        int decimal = 0;
        int n = 0;
        while(true){
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp*Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }

        return decimal;
    }
    public static void main(String[] args) {
        System.out.println(getDecimal(11011));
        int no = 0b11011;
        System.out.println(no);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter binary number");

        int num = Integer.parseInt(sc.nextLine(), 2);
        System.out.println(num);
        sc.close();

    }
}
