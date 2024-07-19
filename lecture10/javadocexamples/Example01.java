package javadocexamples;

import java.lang.reflect.Array;

// info: https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Array.html

public class Example01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        int index = 0;
        int index_val = Array.getInt(arr,index);
        System.out.println("index : " + index +  " value: "+ index_val);
        index = 1;
        index_val = Array.getInt(arr, index);
        System.out.println("index : " + index +  " value: "+ index_val);
        index = 2;
        index_val = Array.getInt(arr, index);
        System.out.println("index : " + index +  " value: "+ index_val);


    }
}
