class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m!=n){
            return false;
        }
        else{
            int c[]=new int[26];
            for(int i=0;i<m;i++){
                c[s.charAt(i)-'a']++;
            }
            for(int i=0;i<n;i++){
                c[t.charAt(i)-'a']--;
            }
            for(int i=0;i<c.length;i++)
            {
                if(c[i]!=0){
                    return false;
                }
            }
        }
        return true;
        
    }
}