class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int current = 0;
        int high = nums.length - 1;

        while (current <= high) {
            if (nums[current] == 0) {
                // Swap nums[low] and nums[current]
                int temp = nums[low];
                nums[low] = nums[current];
                nums[current] = temp;
                low++;
                current++;
            } else if (nums[current] == 1) {
                current++;
            } else { // nums[current] == 2
                // Swap nums[current] and nums[high]
                int temp = nums[current];
                nums[current] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
