class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int l=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            l++;
        }
        return l;
        
    }
    public static void main(String s){
        Scanner in=new Scanner(System.in);
        Solution ss=new Solution();
        String s1=in.nextLine();
        System.out.print(ss.lengthOfLastWord(s1));
        
    }
}