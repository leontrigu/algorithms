package src.main.java.com.leontrigu.strings;

public class CharactersSame {
    public static void main(String[] args) {
        String word = "aaa";
        System.out.println("Is All characters the same -> "+word+ ": "+isAllCharactersSame(word));
    }

    public static boolean isAllCharactersSame(String input) {
        for (int i = 1, length = input.length(); i < length; ++i) {
            if (input.charAt(i) != input.charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
