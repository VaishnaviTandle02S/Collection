package FirstMockLogic;

import java.util.Arrays;

public class ReverseWord {
    public static void main(String[] args) {
        String s= "My name is Vaish";
        String[] arr = s.split(" ");
        System.out.printf(Arrays.toString(arr));
    }
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//import java.util.*;
//        import java.lang.*;
//class Main {
//    public static void main(String[] args) {
//        String s = "My name is java";
//        String[] arr = s.split(" ");
//        String res="";
//        for(int i=arr.length-1;i>=0;i--){
//            res+=arr[i]+" ";
//        }
//        System.out.println(res);
//    }
//}