package FirstMockLogic;

public class FreqChar {
        public static void main(String[] args) {
            String str = "vaishnavi";
            int[] countchar = new int[26];
            char ch;

            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                countchar[ch - 'a'] = countchar[ch - 'a'] + 1;
            }

            for (int i = 0; i < countchar.length; i++) {
                if (countchar[i] > 0) {
                    System.out.println((char) (i + 'a') + "->" + countchar[i]);
                }
            }
        }
}
