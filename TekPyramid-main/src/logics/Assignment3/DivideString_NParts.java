package logics.Assignment3;
public class DivideString_NParts {
    public static void main(String[] args) {
        String s = "vaishnavi Tandle2";
        s = s.replaceAll(" ", "");
        int len = s.length();
        System.out.println(len);
        int div = 4;
        if (len % div != 0) {
            System.out.println("String cannot divide and store");
            //return;
        } else {
            int part = len / div;
            for (int i = 0; i < len; i = i + part) {
                System.out.println(s.substring(i, i + part));
            }
        }
    }
}

//---------------------------------*************************-----------------------------------------------

//package logics.Assignment3;
//public class DivideString_NParts {
//    public static void main(String[] args) {
//        String s = "vaishnavi Tandle2000";
//        s = s.replaceAll(" ", "");
//        int len = s.length(); //16
//        System.out.println(len);
//        int div = 3;
//        int rem = len % div;
//        int part = len / div;
//        for (int i = 0; i < len - part; i = i + part) {
//            System.out.println(s.substring(i, i + part));
//        }
//        System.out.println(s.substring(len - rem));
//    }
//}






