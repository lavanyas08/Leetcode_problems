class Solution {
    public boolean isHappy(int n) {
        Set<Integer>set=new HashSet<Integer>();
        
        while(!set.contains(n)&&n!=1){
            set.add(n);
            int sum=0;
            while(n!=0){
                sum=sum+(n%10)*(n%10);
                n=n/10;
            }
            n=sum;
        }
        return n==1;
        
    }
}
