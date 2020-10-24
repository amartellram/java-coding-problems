package chapter01.problem02;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingFirstNoRepeatedChar {

    private static final int EXTENDED_ASCII= 256;

    /**
     * Single traversal
     * Populate an array to store all the indexed appeared only once in the string
     * @param str
     * @return smallest index containing a non-repeated character
     *
     */
    public static char firstNonRepeatedCharacter(String str){
        int[] flags = new int[EXTENDED_ASCII];


        for (int i=0; i< flags.length; i++) {
            flags[i] = -1;
        }

        for (int i =0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(flags[ch] == -1)
                flags[ch] = i;
            else
                flags[ch] = -2;
        }

        int position = Integer.MAX_VALUE;

        for (int i=0; i< EXTENDED_ASCII; i++) {
            if (flags[i] >= 0)
                position = Math.min(position, flags[i]);
        }

        return position == Integer.MAX_VALUE ? Character.MIN_VALUE: str.charAt(position);
    }

    public static char firstNonRepeatedChar(String str) {
        Map<Character, Integer> chars = new LinkedHashMap<>();
        //or use for(char c: str.toCharArray()) {...}
        for(int i=0;i< str.length(); i++) {
            char ch = str.charAt(i);

            chars.compute(ch, (k, v) -> v == null ? 1 : ++v);
        }

        for(Map.Entry<Character, Integer> entry: chars.entrySet()) {
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return Character.MIN_VALUE;
    }

    public static String firstNonRepeatedChar_withStream(String str) {
        Map<Integer, Long> chs = str.codePoints()
                .mapToObj(cp -> cp)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));

        int cp = chs.entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(Integer.valueOf(Character.MIN_VALUE));

        return String.valueOf(Character.toChars(cp));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type string: ");
        String input = scanner.nextLine();

        System.out.println("First Non repeated character - single traversal : " + firstNonRepeatedCharacter(input));

        System.out.println("First Non repeated character - Map : " + firstNonRepeatedChar(input));

    }
}
