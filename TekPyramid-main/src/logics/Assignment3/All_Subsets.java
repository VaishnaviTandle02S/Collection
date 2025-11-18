package logics.Assignment3;
public class All_Subsets {
    public static void main(String[] args) {
        String s = "fun";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.print(s.substring(i, j) + " "); //o/p--> f fu fun u un n
            }
        }
    }
}

//------------------------------*******************************------------------------------------------

//package logics.Assignment3;
//public class All_Subsets {
//    public static void main(String[] args) {
//        String s ="fun";
//        int len = s.length();
//        for(int i=0; i < len; i++){
//            for(int j = 0; j < len-i; j++){
//                System.out.print(s.substring(i+j,len)+" "); //o/p--> fun un n un n n
//            }
//        }
//    }
//}

//----------------------------------******************************------------------------------------------

//package logics.Assignment3;
//public class All_Subsets {
//    public static void main(String[] args) {
//        String s="fun";
//        int len=s.length();
//        for(int i=0; i<len; i++){
//            for(int j=i; j<len; j++){
//                System.out.print(s.substring(j,len)+" "); //o/p--> fun un n un n n
//            }
//        }
//    }
//}
