package conflict;

public class DemoClass {
    static int num = 6;
    public static void main(String[] args){
        int num = 3;
        System.out.println("num: " + num);
        System.out.println("class num:" + DemoClass.num);

    }
}
