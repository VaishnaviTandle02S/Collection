package logics.Assignment2;

import java.util.Arrays;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        System.out.println(Arrays.toString(arr));
        int largest  = arr[0];
        int secondlargest = arr[0];
        int thirdlargest = arr[0];

        for(int i =0; i < arr.length; i++){
            if(arr[i]>largest){
                thirdlargest=secondlargest;
                secondlargest=largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlargest && arr[i] != largest) {
                thirdlargest=secondlargest;
                secondlargest=arr[i];
            }
            else if(arr[i]>thirdlargest && arr[i] != largest && arr[i] != secondlargest){
                thirdlargest=arr[i];
            }

        }
        System.out.println("thirdlargest ->" + thirdlargest);
    }
}
