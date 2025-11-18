package logics.Assignment4;


public class DuplicateWords {
    public static void main(String[] args){
        String s="java is fun and easy and java";
        String[] arr=s.split(" ");
        for(int i=0; i<arr.length;i++){
            if(arr[i]==null) continue;
            int count=1;

            for(int j=i+1; j<arr.length;j++){
                if(arr[i].equals(arr[j]))
                {
                    count++;
                    arr[j]=null;
                }
            }
            if(count>1)
                System.out.println(arr[i]);
        }
    }
}


