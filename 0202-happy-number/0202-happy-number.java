class Solution {
    public boolean isHappy(int n) {
        Set<Integer>set=new HashSet<Integer>();
        if(n==1)
            return true;
        if(n==0)
            return false;
        while(!set.contains(n)&&n!=1){
            set.add(n);
            int sum=0;
            while(n!=0){
                sum=sum+(int)Math.pow(n%10,2);
                n=n/10;
            }
            n=sum;
        }
        return n==1;
        
    }
}
