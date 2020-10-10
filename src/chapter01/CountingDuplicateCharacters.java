package chapter01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountingDuplicateCharacters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type string: ");
        String input = scanner.nextLine();

        var duplicates = countDuplicateChars(input);
        System.out.println("Functional style: " + Arrays.toString(duplicates.entrySet().toArray()));

        var duplicateChars = countDuplicateChars1(input);
        System.out.println("Normal style: " + Arrays.toString(duplicateChars.entrySet().toArray()));

    }

    public static Map<Character, Integer> countDuplicateChars1(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i=0; i<str.length();i++) {
            char ch = str.charAt(i);

            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        return result;
    }

    public static Map<Character, Long> countDuplicateChars(String str) {
        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));

        return result;
    }
}
