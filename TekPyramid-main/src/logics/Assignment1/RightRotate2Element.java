package logics.Assignment1;
import java.util.Arrays;

public class RightRotate2Element {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        System.out.println(Arrays.toString(n));
        int num = 2;
        for(int i = 0; i < num; i++) {
            int last = n[n.length-1];
            for (int j = n.length-1; j > 0; j--) {
                n[j] = n[j-1];
            }
            n[0] = last;
        }
        System.out.println(Arrays.toString(n));
    }
}

//----------------------------------Using Collections-----------------------------------------------------

//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class RightRotate2Element {
//    public static void main(String[] args) {
//        int[] n ={1,2,3,4,5};
//        System.out.println(Arrays.toString(n));
//        ArrayList list = new ArrayList();
//        //ArrayList list = new ArrayList(Arrays.asList(1,2,3,4,5)); --> we can pas list like this also
//        for(int num : n){
//            list.add(num);
//        }
//        for(int i = 0; i < 2; i++){
//            Object last=list.get(list.size()-1); //fetching 0th index value from list
//            list.remove(list.size()-1);
//            list.add(0,last);
//        }
//        System.out.println(list);
//    }
//}

//--------------------------------------***********************--------------------------------------------
//-------------------Right Rotating String by 2 position----------------------------------------

//package logics.Assignment1;
//
//public class Right_Rotation_String {
//    public static void main(String[] args) {
//        String s = "abcdef";
//        int n = s.length();
//        int r = 2;
//        String rotated=s.substring(n-r)+s.substring(0,n-r);
//        System.out.println("Before rotation-> " + s +" : "+"After rotation->"+rotated);
//    }
//}



