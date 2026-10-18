class Solution {
    public int[] getConcatenation(int[] nums) {
        int a[]=new int[2*nums.length];
        System.arraycopy(nums,0,a,0,nums.length);
        System.arraycopy(nums,0,a,nums.length,nums.length);
        return a;
    }
}