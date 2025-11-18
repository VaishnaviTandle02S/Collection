package logics.Assignment4;

public class PalindromString {
    public static void main(String[] args) {
        String s="MOM";
        String r="";
        for(int i = s.length()-1; i >= 0; i--){
            r=r+s.charAt(i);
        }
        System.out.println(r.equals(s) ? "palindrom" : "not Palindrom");
    }
}
