class Solution {
    public int lengthOfLastWord(String s) {
        String[] a=s.trim().split(" ");
        String r= a[a.length-1];
        return r.length();
    }
}