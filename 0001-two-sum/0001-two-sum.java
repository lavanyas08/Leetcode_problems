class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []res=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        
        }
        return res;
        
    }
}
public class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        int target=in.nextInt();
        Solution solution=new Solution();
        int []res=solution.twoSum(nums,target);
        System.out.print("["+res[0]+" ,"+res[1]+"]");
    }
}