package logics.Assignment2;

import java.util.Arrays;

public class LargestElementinArray {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        System.out.println(Arrays.toString(arr));
        int largest  = arr[0];
        int smallest = arr[0];

        for(int i =0; i < arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i]<smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("largest -> " + largest);
        System.out.println("smallest -> " + smallest);
    }
}

//--------------------------------*******************-----------------------------------------------------
