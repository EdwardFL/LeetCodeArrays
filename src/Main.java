import java.util.List;

public class Main {
    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        CheckIfTheSentenceIsPangram.checkIfPangram(sentence);
        List<List<String>> data = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );
        CountItemsMatchingARule.countMatches(data, "color", "silver");
        int[] array = {9};
        System.out.println(PlusOne.plusOne(array));
    }
}