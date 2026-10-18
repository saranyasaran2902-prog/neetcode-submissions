class Solution {
    public int[] getConcatenation(int[] nums) {
        int a[]=IntStream.concat(Arrays.stream(nums),Arrays.stream(nums)).toArray();
      return a;
    }
}