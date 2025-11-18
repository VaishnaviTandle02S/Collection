package logics.Assignment3;
public class TotalVowels_TotalConso {
    public static void main(String[] args) {
        String name = "vaishnavi";
        String vowels = name.replaceAll("[^aeiou]", "");
        String consonants = name.replaceAll("[aeiou]", "");
        System.out.println(name + "-> vowels:" + vowels + "->" + vowels.length());
        System.out.println(name + "-> consonants:" + consonants + "->" + consonants.length());
    }
}

//----------------------------************************----------------------------------------------

