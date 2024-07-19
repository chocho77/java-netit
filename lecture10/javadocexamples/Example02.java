package javadocexamples;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Example02 {
    public static void main(String[] args) {
        int lnth = 4;  
        Object obj = Array.newInstance(Integer.class, lnth);  
        for (int i = 0; i < lnth; i++) {  
            Array.set(obj, i, Integer.valueOf(i));  
        }  
        Object temp = Array.get(obj,3);
        System.out.println(temp);
        
        temp = Array.get(obj, 2);
        System.out.println(temp);


        System.out.println(Arrays.toString((Object[]) obj));  

        
    }
    
}
