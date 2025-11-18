// Java Program to Find the Maximum and Minimum Occurring Characters in a String
package logics.Assignment4;

import java.util.Arrays;

public class FindMax_MinChar{
    public static void main(String[] args) {
        String str = "abbcaa";
        int[] arr = new int[26];
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            arr[ch-'a']++;
        }
        System.out.println(Arrays.toString(arr));

        int large = arr[0];
        int small =  arr[0];
        int largeIndex=0;
        int smallIndex=0;

        for (int i = 0; i < arr.length; i++) {
               //System.out.println((char) ( i + 'a')+ "->"+arr[i]);

                if (arr[i] > large) {
                    large = arr[i];
                    largeIndex=i;

                }
                if (arr[i] <= small && arr[i]!=0) {
                    small = arr[i];
                    smallIndex=i;
                }
        }
        System.out.println(small +" " +(char) ( smallIndex + 'a'));
        System.out.println(large+ " "+(char) ( largeIndex + 'a'));
    }
}


