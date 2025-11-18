//Java Program to Left Rotate the Elements in an Array by 2 Positions

package logics.Assignment1;
import java.util.Arrays;

public class LeftRotate2Element {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        System.out.println(Arrays.toString(n));
        int num=2;
        for(int i = 0; i < num; i++){
            int first = n[0];
            for(int j = 0; j < n.length-1;j++){
                n[j]=n[j+1];
            }
            n[n.length-1]=first;
        }
        System.out.println(Arrays.toString(n));
    }
}

//---------------------------------Using Collection------------------------------------------------------
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class LeftRotate2Element {
//    public static void main(String[] args) {
//        int[] n ={1,2,3,4,5};
//        System.out.println(Arrays.toString(n));
//        ArrayList list = new ArrayList();
//        for(int i : n){
//            list.add(i);
//        }
//        for(int i = 0; i < 2; i++){
//            Object first=list.get(0); //fetching 0th index value from list
//            list.remove(0);
//            list.add(first); //if u add element then it will add from end
//        }
//        System.out.println(list);
//    }
//}

//--------------------------------------***********************--------------------------------------------
//-------------------Left Rotating String by 2 position----------------------------------------

//package logics.Assignment1;
//
//public class Left_Rotation_String {
//    public static void main(String[] args) {
//        String s = "abcdef";
//        int r = 3;
//        String rotated=s.substring(r)+s.substring(0,r);
//        System.out.println("Before rotation-> " + s +" : "+"After rotation->"+rotated);
//    }
//}
