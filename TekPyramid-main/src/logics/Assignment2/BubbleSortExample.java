package logics.Assignment2;
import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 3, 1};
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

//---------------------------------------************************----------------------------------------
//----------------using collections----> its not Bubble sort-----------------------------------------
//package logics.Assignment2;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class SortUsingCollections {
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(5, 1, 4, 2, 8);
//        Collections.sort(numbers); // uses Timsort internally
//        System.out.println(numbers);
//    }
//}

//------------------------------------*****************************--------------------------------------
//---------------------------BubbleSort----->characters and String---------------------------------------

//package logics.Assignment2;
//
//public class BubbleSortCharacters {
//    public static void main(String[] args) {
//        String str = "vaishnavi";
//        char[] arr = str.toCharArray(); // convert string to char array
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) { // compare characters by ASCII value
//                    char temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println("Sorted characters: " + new String(arr));
//    }
//}

