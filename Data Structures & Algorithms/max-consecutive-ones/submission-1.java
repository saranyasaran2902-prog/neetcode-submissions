class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int r=0,c=0;
        for(int n:nums){
            c=(n==1)?c+1:0;
            r=Math.max(r,c);
        }
        return r;
    }
}