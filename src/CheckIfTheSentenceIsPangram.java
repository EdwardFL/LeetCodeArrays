import java.util.HashMap;
import java.util.Map;

public class CheckIfTheSentenceIsPangram {
    public static boolean checkIfPangram(String sentence) {
        int numberOfLetters = 26;
        Map<Integer, Character> map = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < sentence.length(); i++) {
            if (alphabet.contains(Character.toString(sentence.charAt(i))) && !map.containsValue(sentence.charAt(i))) {
                map.put(i, sentence.charAt(i));
            }
        }
        if (map.size() == numberOfLetters) {
            return true;
        }
        return false;
    }
}
