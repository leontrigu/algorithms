package src.main.java.com.leontrigu.strings;

public class HammingDistance {

    public static void main(String[] args) throws Exception {
        String first = "America";
        String second = "Greater";
        System.out.println("Hamming distance between -> "+first+ " and "+second+ " is: "+calculateHammingDistance(first, second));
    }

    //the Hamming distance between two strings of equal length is the number of positions at which the corresponding symbols are different
    public static int calculateHammingDistance(String s1, String s2)
            throws Exception {
        if (s1.length() != s2.length()) {
            throw new Exception("String lengths must be equal");
        }

        int stringLength = s1.length();
        int counter = 0;

        for (int i = 0; i < stringLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}
