package stringNumbersMath.problem04;

public class StringChecker {

    public static boolean containsOnlyDigits(String str) {

        for (int i=0 ; i< str.length() ; i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }

        return true;
    }

    public static boolean containsOnlyDigits_Functional(String str) {
        return !str.chars()
                .anyMatch(n -> !Character.isDigit(n));
    }

    public static boolean containsOnlyDigits_Match(String str){
        return str.matches("[0-9]+");
    }

}
