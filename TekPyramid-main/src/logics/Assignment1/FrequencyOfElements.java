//Java Program to Find the Frequency of Character in an Array

package logics.Assignment1;

public class FrequencyOfElements {
    public static void main(String[] args) {
        String str = "vaishnavi";
        int[] countchar = new int[26];
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            countchar[ch - 'a'] = countchar[ch - 'a'] + 1;
        }

        for (int i = 0; i < countchar.length; i++) {
            if (countchar[i] > 0) {
                System.out.println((char) (i + 'a') + "->" + countchar[i]);
            }
        }
    }
}

//--------------------------------*******************-----------------------------------------------------

//-------------------Using Collections -------> frequency of character in an Array-----------------------------

//package logics.Assignment1;
//import java.util.LinkedHashMap;
//import java.util.Map;

//public class FrequencyOfElements {
//    public static void main(String[] args) {
//        String s = "vaishnavi";
//        LinkedHashMap<Character, Integer> m = new LinkedHashMap<>();
//        for (char ch : s.toCharArray()) {
//            m.put(ch, m.getOrDefault(ch, 0) + 1);
//        }
//
//        m.forEach((key, value) -> {
//           if(value==1) // To get unique char from Array
//           if(value>1) // To get duplicate char from Array
//           if (value > 0)
//                System.out.println(key + "->" + value);
//        });
//
//        /*for (Map.Entry<Character, Integer> x : m.entrySet()) {
//            if (x.getValue() > 0) {
//                System.out.println(x.getKey() + "->" + x.getValue());
//            }
//        }*/
//    }
//}

//--------------------------------*******************-----------------------------------------------------

//--------------------------------Frequency of numbers in an Array-----------------------------


//package logics.Assignment1;
//public class FrequencyOfNumbers {
//    public static void main(String[] args) {
//        String str = "12891328121"; // numeric string
//        int[] countNum = new int[10]; // 0 to 9 → 10 digits
//        char ch;
//
//        // Loop through each character in the string
//        for (int i = 0; i < str.length(); i++) {
//            ch = str.charAt(i); // get each character
//            if (Character.isDigit(ch)) { // check if it is a digit
//                countNum[ch - '0']++; // convert char digit to integer index
//            }
//        }
//        // Print frequency of each digit
//        for (int i = 0; i < countNum.length; i++) {
//            if (countNum[i] > 0) {
//                System.out.println(i + " -> " + countNum[i]);
//            }
//        }
//    }
//}

//--------------------------------*******************-----------------------------------------------------
//-----------------------------------Using Collections---------------------------------------
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//public class FrequencyOfElements {
//    public static void main(String[] args) {
//        int[] a = {1, 2, 4, 1, 3, 2};
//        Map<Integer, Integer> m = new LinkedHashMap<>();
//        for (int x : a) {
//            m.put(x, m.getOrDefault(x, 0) + 1);
//        }
//        for (Map.Entry<Integer, Integer> x : m.entrySet()) {
//                System.out.println(x.getKey() + "->" + x.getValue());
//        }
//    }
//}