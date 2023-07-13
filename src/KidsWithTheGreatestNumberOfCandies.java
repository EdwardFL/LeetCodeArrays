/* https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/  */

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxValue = Integer.MIN_VALUE;
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i < candies.length; i++) {
            if (candies[i] > maxValue) {
                maxValue = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxValue) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
