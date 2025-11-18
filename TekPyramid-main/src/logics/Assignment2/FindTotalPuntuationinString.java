//---------using inbuilt method-----------------------
package logics.Assignment2;
class FindTotalPuntuationinString {
    public static void main(String[] args) {
        String str = "Hi ,how are you??";
        String res=str.replaceAll("[^\\p{Punct}]","");
        System.out.println(res+"->"+res.length());
    }
}

//--------------------------------*******************-----------------------------------------------------

//package logics.Assignment2;
//
//public class FindTotalPuntuationinString {
//    public static void main(String[] args) {
//        String str = "Hello!!! How are you doing today? I'm fine, thank you.";
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == '!' || ch == ',' || ch == ';' || ch == '.' ||
//                    ch == '?' || ch == '-' || ch == '\'' || ch == '\"') {
//                count++;
//                System.out.print(ch);
//            }
//        }
//        System.out.println("->"+count);
//    }
//}

//--------------------------------*******************-----------------------------------------------------
//using inbuilt method ---> Character.isLetterOrDigit() & Character.isSpaceChar(check)

//package logics.Assignment2;

//public class FindTotalPuntuationinString {
//    public static void main(String[] args) {
//        String str = "Hi,how are you???";
//        int count = 0;
//        char check = 0;
//        char ch=0;
//        for (int i = 0; i <= str.length() - 1; i++) {
//            check = str.charAt(i);
//            if (!Character.isLetterOrDigit(check) && !Character.isSpaceChar(check)) {
//                ch = check;
//                count=count+1;
//                System.out.print(ch);
//            }
//        }
//        System.out.println("->"+count);
//    }
//}

//--------------------------------*******************-----------------------------------------------------

//package logics.Assignment2;
//public class FindTotalPuntuationinString {
//    public static void main(String[] args) {
//        String str = "Hello,How are you doing today? I'm fine; thanks.";
//        int count = 0;
//        // List of punctuation characters we want to count
//        String punctuations = ".,;:!?'-()\"";
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch=str.charAt(i);
//            if (punctuations.indexOf(str.charAt(i)) != -1) {
//                count++;
//                System.out.print(ch);
//            }
//        }
//        System.out.println("->" + count);
//    }
//}





