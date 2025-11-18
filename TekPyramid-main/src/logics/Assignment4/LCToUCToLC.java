package logics.Assignment4;

public class LCToUCToLC {
    public static void main(String[] args){
        String s1="Java ProgramMing lanGuage";
        String s2="";
        //s1=s1.replaceAll("\\s+","");

        for(char ch:s1.toCharArray()){
            if(Character.isUpperCase(ch))
                s2+=(Character.toLowerCase(ch));
            else
                s2+=(Character.toUpperCase(ch));
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
