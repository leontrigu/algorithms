package src.main.java.com.leontrigu.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckVowels {
    public static void main(String[] args) {
        String input = "bcdfga";
        System.out.println("The input -> "+input+ "has vowels :"+hasVowels(input));
    }

    public static boolean hasVowels(String input) {
        if (input == null) {
            return false;
        }
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (VOWELS.contains(input.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static final Set<Character> VOWELS = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u')
    );
}
