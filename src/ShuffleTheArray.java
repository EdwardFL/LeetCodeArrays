public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[2 * n];

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0 ) {
                shuffledArray[i] = nums[i / 2];
            } else {
                shuffledArray[i] = nums[n++];
            }
        }
        return shuffledArray;
    }
}
