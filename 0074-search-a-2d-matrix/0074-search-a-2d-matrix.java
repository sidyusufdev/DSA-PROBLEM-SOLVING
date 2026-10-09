class Solution {
   public static boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return false;
    }

    int m = matrix.length;
    int n = matrix[0].length;
    int lo = 0, hi = m * n - 1;

    while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        int row = mid / n;
        int col = mid % n;
        int val = matrix[row][col];

        if (val == target) {
            System.out.println("found at(" + row + "," + col + ")");
            return true;
        } else if (val < target) {
            lo = mid + 1;
        } else {
            hi = mid - 1;
        }
    }
    System.out.println("key not found");
    return false;
}
    public static void main (String[]args){
        int matrix[][] =  {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int target = 3;
        searchMatrix(matrix,target);
    }
}