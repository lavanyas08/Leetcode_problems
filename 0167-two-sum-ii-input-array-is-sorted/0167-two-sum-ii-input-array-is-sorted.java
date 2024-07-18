class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            int s=numbers[i]+numbers[j];
            if(s==target)
                return new int[] {i+1,j+1};
            else if(s>target)
                j--;
            else
                i++;
        }
       return new int[] {-1, -1};
    }
}