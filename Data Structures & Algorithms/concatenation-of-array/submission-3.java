class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] a=new int[2*nums.length];
        int n=nums.length;
        for(int i=0;i<n;i++){
            a[i]=a[i+4]=nums[i];
        }
        return a;
    }
}