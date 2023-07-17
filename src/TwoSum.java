import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (integerMap.get(nums[i]) != null) {
                return new int[] {i, integerMap.get(nums[i])};
            }
            integerMap.put(target - nums[i], i);
        }
        return nums;
    }
}
