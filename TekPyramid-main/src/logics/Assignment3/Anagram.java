//------------------------------using Array sort---------------------------------------------
package logics.Assignment3;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(c1);
        System.out.println(c2);
        if (Arrays.equals(c1, c2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
//---------------------------------**************************-------------------------------------------

//package logics.Assignment3;
//public class Anagram {
//    public static void main(String[] args) {
//        String s1 = "cat";
//        String s2 = "act";
//        int len = s1.length();
//
//        if (s1.length() != s2.length()) {
//            System.out.println("Not Anagram");
//        }
//
//        else {
//            for (int i = 0; i < len; i++) {
//                char ch = s1.charAt(0);
//                s1 = s1.replace(ch + "", "");
//                s2 = s2.replace(ch + "", "");
//            }
//
//            if (s1.length() == 0 && s2.length() == 0) {
//                System.out.println("Anagram");
//            } else System.out.println("Not Anagram");
//        }
//    }
//}

//---------------------------------**************************--------------------------------------------
//---------------------------using While loop + Method with parameter & return type------------------------------------------------

//package logics.Assignment3;
//public class Anagram {
//    public static void main(String args[]) {
//        String s1 = "amma";
//        String s2 = "mama";
//        System.out.println(isAnagram(s1, s2));
//    }
//
//    public static String isAnagram(String s1, String s2) {
//        while (s1.length() == s2.length()) {
//            if ((s1.length() == 0) && (s2.length() == 0))
//                return "Anagram";
//
//            char c = s1.charAt(0);
//            s1 = s1.replace(c + "", "");
//            s2 = s2.replace(c + "", "");
//        }
//        return "Not Anagram";
//    }
//}


