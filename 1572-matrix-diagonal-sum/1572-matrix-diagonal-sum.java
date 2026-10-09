class Solution {
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i<mat.length; i++){
            //pehla diagonal nikala hai 
            sum += mat[i][i];
            // yhan pe hm check krre hai ki pehle diagonal ka middle element dusre wale mai na add ho jaaye dubara se  
            if (i!=(n-1-i)){
                // yhan pe hm dusra diagonal nikal rhe 
                sum += mat[i][n-1-i];
            } 
        }
        return sum;
        
    }
    public static void main (String []args){
        int mat [][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
}