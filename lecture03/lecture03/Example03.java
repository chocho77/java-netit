package lecture03;

public class Example03 {
    public static void main(String[] args) {
        char symbole1 = 'R';
        char symbole2 = 65;
        char symbole3 = 44;
        System.out.println("Symbole1 = " + symbole1);
        System.out.println("Symbole2 = " + symbole2);
        System.out.println("Symbole3 = " + symbole3);

        for(char i = 1; i < 250;i++){
            char tempSymbol = i;
            System.out.print(tempSymbol + " ");
        }

    }
}
