class Solution {
    public int countSeniors(String[] details) {
        int r=0;
        for(String s:details){
            if(Integer.parseInt(s.substring(11,13))>60){
                r++;
            }
        }
        return r;
    }
}