class Solution {
    public static int trap(int height[]) {
        // yhan pe humnne left ki sbse bdi height ko find krre hai 
        int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0]=height[0];
        for (int i = 1; i<n; i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        // yhan pe hm right ki bdi height ko find krre hai 
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for (int i =n-2; i>=0; i--){
            rightmax[i]= Math.max(height[i],rightmax[i+1]);
        }
        // yhan pe hm trapped water nikal rhe hai 
        int trappedwater = 0;
        for (int i=0; i<height.length;i++){
            // yhan pe hm left ki height aur right ki height ko compare krre hai ki in dono mai se choti value kiski hai 
             int waterlevel = Math.min(leftmax[i],rightmax[i]);
             // yhan pe vo formula lagega jo ki hai trapppedwater nikalne ke liye dono mai se minimum height kiski hai minus kro meri height ko 
            trappedwater += waterlevel-height[i];
        }
        return trappedwater;

        
    }
    public static void main (String[]args){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
