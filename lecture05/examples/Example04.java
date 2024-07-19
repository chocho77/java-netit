package examples;

public class Example04 {
    public static int sumNumbers(int a, int b, int c){
        return a + b + c;

    }
    public static void main(String[] args) {
        int sum = Example04.sumNumbers(2, 3, 4);
        System.out.println("sum = " + sum);
        sum = Example04.sumNumbers(12, 14, 21);
        System.out.println("sum = " + sum);
        
    }
    
}
