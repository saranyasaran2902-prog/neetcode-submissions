class Solution {
    public boolean isAnagram(String s, String t) {
        boolean r=true;
      int a[]=new int[26];
      if(s.length()!=t.length()){
        return false;
      }
      for(int i=0;i<s.length();i++){
         a[s.charAt(i)-'a']++;
         a[t.charAt(i)-'a']--;
      }for(int i:a){
        if(i!=0){
            r=false;
        }
      }
      return r;
    }
}
