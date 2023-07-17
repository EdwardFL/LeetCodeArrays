public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            while (nums[i] != 0) {
                nums[i] = nums[i] / 10;
                count++;
            }
            if (count % 2 == 0) {
                res++;
            }
        }
        return res;
    }
}
