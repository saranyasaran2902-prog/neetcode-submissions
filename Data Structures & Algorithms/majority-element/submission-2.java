class Solution {
    public int majorityElement(int[] nums) {
        int n=nums[0];
        for(int i:nums){
             int c=0;
             if(c==0){
                n=i;
             }
             c+=(i==n)?1:-1;
        }
        return n;
    }
}