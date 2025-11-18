package logics.Assignment5;

public class Trancepose {
    public static void main(String[] args) {
        tracepose();
    }
    private static void tracepose() {
        int[][] arr={{1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }


    }
}
