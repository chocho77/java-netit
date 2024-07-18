public class Example01{
    public static void main(String[] args) {
        int myFirstInt, mySecondInt;
        myFirstInt = 5;
        mySecondInt = 5;
        System.out.println("Test Message.");
        System.out.printf("myFirstInt = %d\n", myFirstInt);
        System.out.printf("mySecondInt = %d\n", mySecondInt);
        if (myFirstInt < mySecondInt){
            System.out.println("myFirstInt is less than mySecondInt.");
        } else if(myFirstInt == mySecondInt){
            System.out.println("myFirstInt is equel yo mySecondInt ");
        } else {
            System.out.println("myFirstInt is greater than mySecondInt");

        }
     
    }

}
