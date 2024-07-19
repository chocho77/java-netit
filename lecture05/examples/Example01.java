package examples;

public class Example01 {
    private static double divideNumbers(double a, double b){
        boolean isZero;
        isZero = b == 0 ? true: false;
        if (isZero) {
            System.out.println("Cannot divide by zero!");
        }
        return(isZero ? 0: a/b);
    }
    public static void main(String[] args) {
        double num = 10.0;
        double div = 0;
        double result = Example01.divideNumbers(num, div);
        System.out.println("Result: " + result);
        
        

    }
}