class Solution {
    public int heightChecker(int[] heights) {
        int a[]=new int[heights.length];
        System.arraycopy(heights,0,a,0,heights.length);
        Arrays.sort(a);
        int c=0;
        for(int i=0;i<heights.length;i++){
            if(a[i]!=heights[i]){
                c++;
            }
        }
        return c;
    }
}