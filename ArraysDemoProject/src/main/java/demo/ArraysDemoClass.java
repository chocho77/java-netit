package demo;

public class ArraysDemoClass {
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    public static void main(String[] args) {
        // info source: https://www.w3schools.com/java/java_arrays_multi.asp
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        int[][] myMatrix = {{1, 2, 3, 4},
                              {5, 6, 7, 8},
                              {9,10,11,12},
                             {13,14,15,16}};

        for (int[] myNumber : myNumbers) {
            for (int i : myNumber) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("--------");
        for (int[] myElement : myMatrix){
            for(int i : myElement){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("------------");
        System.out.println(myNumbers[0][0]);
        System.out.println(myNumbers[0][1]);
        System.out.println(myNumbers[0][2]);
        System.out.println(myNumbers[0][3]);
        System.out.println(myNumbers[1][0]);
        System.out.println(myNumbers[1][1]);
        System.out.println(myNumbers[1][2]);
        myMethod(); // call method


    }
}

