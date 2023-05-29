package src.main.java.com.leontrigu.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String ar[]) {

        String firstWord="communication";
        String secondWord="mcomunicatnio";

        System.out.println("Are they anagram ? first approach: "+ firstApproach(firstWord, secondWord));
        System.out.println("Are they anagram ? second approach: "+ secondApproach(firstWord, secondWord));
    }

    static boolean firstApproach(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        char[] a1 = first.toCharArray();
        char[] a2 = second.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    static boolean secondApproach(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        char firstToChar[] = first.toCharArray();
        char secondToChar[] = second.toCharArray();
        Map<?, ?> firstMap = buildMap(firstToChar);
        Map<?, ?> seconddMap = buildMap(secondToChar);

        if (firstMap.equals(seconddMap)) {
            return true;
        }
        return false;
    }

    private static Map<Character, Integer> buildMap(char[] ch) {
        Map<Character, Integer> map=new HashMap<Character, Integer>();
        for(int i=0;i<ch.length;i++) {
            if(!map.containsKey(ch[i])) {
                map.put(ch[i],0);
            }else {
                map.put(ch[i], map.get(ch[i])+1);
            }
        }
        return map;
    }

}
