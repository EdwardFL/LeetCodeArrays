import java.util.List;

public class CountItemsMatchingARule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List list : items) {
            Object[] array = list.toArray();
                if (ruleKey.equals("type") && ruleValue.equals(array[0]) ||
                        ruleKey.equals("color") && ruleValue.equals(array[1]) ||
                        ruleKey.equals("name") && ruleValue.equals(array[2])) {
                    count++;
            }
        }
        return count;
    }
}
