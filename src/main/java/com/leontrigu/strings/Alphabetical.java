package src.main.java.com.leontrigu.strings;

public class Alphabetical {

    public static void main(String[] args) {
        String chain = "abcdefg";
        System.out.println("Is alphabetical sorted -> "+chain+": "+isAlphabetical(chain));
    }

    public static boolean isAlphabetical(String input) {
        input = input.toLowerCase();
        for (int i = 0; i < input.length() - 1; ++i) {
            if (!Character.isLetter(input.charAt(i)) || !(input.charAt(i) <= input.charAt(i + 1))) {
                return false;
            }
        }
        return true;
    }
}
