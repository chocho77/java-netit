package examples;
import demo.CalculatorClass;

public class Example01 {
    public static void main(String[] args) {
        double num1 = 3.44;
        double num2 = 5.66;
        CalculatorClass calc = new CalculatorClass(num1,num2);
        double result = calc.getAddNumbers();
        System.out.printf("%f + %f = %f", num1,num2,result);
        
    }
    
}
