class Solution {
    public int search(int[] nums, int target) {
        int s=0,l=nums.length;
        while(s<l){
            if(nums[s]==target){
                return s;
            }
            s++;
            
        }
        return -1;
    }
}