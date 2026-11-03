class Solution {
    public String longestCommonPrefix(String[] s) {
        String a="";
        Arrays.sort(s);
        for(int i=0;i<s[0].length();i++){
            if(s[0].charAt(i)!=s[s.length-1].charAt(i)){
                return s[0].substring(0,i);
            }
            
        }
        return s[0];
    }
}