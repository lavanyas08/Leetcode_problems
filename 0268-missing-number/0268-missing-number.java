class Solution {
    public int missingNumber(int[] nums) {
        int length=nums.length;
        int x=0,y=0;
        for(int i=0;i<=length;i++){
             x=x^i;
        }
        for(int i=0;i<length;i++)
        {
            y=y^nums[i];
        }
        return x^y;
        
    }
}