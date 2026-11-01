class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> h=new HashMap<>();
       HashMap<Character,Integer> k=new HashMap<>();
       for(int i=0;i<s.length();i++){
        h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
       }
       for(int j=0;j<t.length();j++){
        k.put(t.charAt(j),k.getOrDefault(t.charAt(j),0)+1);
       }
       return h.equals(k);
    }
}
