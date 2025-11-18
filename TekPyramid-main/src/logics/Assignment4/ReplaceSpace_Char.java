package logics.Assignment4;

import java.util.Scanner;

public class ReplaceSpace_Char {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String ch=sc.next();

        //String s = "vaishnavi Tandle from  Tek";
        s = s.replaceAll("\\s+",ch );

        System.out.println(s);
    }
}
