public class LetterCase {
    public static String findCase(String str) {
        String letterCase = "NP";

        if(str.compareTo("a") < 0) {
            letterCase = "Uppercase";
        } else {
            letterCase = "Lowercase";
        }

        return letterCase;
    }
}
