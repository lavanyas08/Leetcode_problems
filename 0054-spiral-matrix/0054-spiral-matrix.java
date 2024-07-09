class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer>l=new LinkedList<Integer>();
        int r=0,c=0;
        while(r<n&&c<m){
            for(int i=c;i<n;i++){
                l.add(matrix[r][i]);
            }
            r++;
            for(int i=r;i<m;i++){
                l.add(matrix[i][n-1]);
            }
            n--;
            if(r<m){
                for(int i=n-1;i>=c;i--){
                    l.add(matrix[m-1][i]);
                }
                m--;
            }
            if(c<n){
                for(int i=m-1;i>=r;i--){
                    l.add(matrix[i][c]);
                }
                c++;
            }
        }
        return l;
    }
}