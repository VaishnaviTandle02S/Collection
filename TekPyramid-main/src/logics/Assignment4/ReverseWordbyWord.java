package logics.Assignment4;

public class ReverseWordbyWord {
    public static void main(String[] args) {
        String s = "i love prgm";
        String[] arr= s.split(" ");
        for(int i = arr.length-1; i >=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
