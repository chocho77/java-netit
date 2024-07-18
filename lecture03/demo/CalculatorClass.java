package demo;

public class CalculatorClass {
    double numberOne, numberTwo;

    

    public CalculatorClass(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public double getAddNumbers(){
        return this.numberOne + this.numberTwo;
    }
    
}
