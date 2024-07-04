class Solution {
    public void rotate(int[] nums, int k) {
       // k=k%n;
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        System.out.print("[");
        for(int nn:nums){
            System.out.print(nn+",");
        }
        System.out.print("]");
        
    }
    public static void reverse(int nums[],int start, int end){
        while(start<=end){
            int tem=nums[start];
            nums[start]=nums[end];
            nums[end]=tem;
            start++;
            end--;
        }
    }
}