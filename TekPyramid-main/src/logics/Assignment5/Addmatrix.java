package logics.Assignment5;

import java.util.Arrays;

public class Addmatrix {
    public static void main(String[] args) {
        addMatrix();
    }
    static void addMatrix() {

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr3=new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j]=arr[i][j]+arr2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(arr3));
    }
}
