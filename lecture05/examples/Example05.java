package examples;

public class Example05 {
    public static void parseInteger(int... nums){
        for(int i = 0 ; i < nums.length; i++)
        System.out.print(nums[i] + " ");
        System.out.print("End. ");
        System.out.println();


    }

    private static int count(int num){
        System.out.print(num + " ");
        return (num > 0 ? count(num - 1): 0);
    }

    public static void main(String[] args) {
        
        Example05.parseInteger(1,2,3);
        Example05.parseInteger(34,4,3,4,4);
        Example05.parseInteger(23, 45,33,22,12,33,12,34,556,54);
        Example05.count(6);
        System.out.print("End Program.");
        System.out.println();

    }
    
}
