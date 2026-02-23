class Solution {
    public boolean isAnagram(String s, String t) {
        // Map<Character, Integer> map = new HashMap<>();
        // if(s.length() != t.length()) return false;
        // for(char c : s.toCharArray()){
        //     map.put(c, map.getOrDefault(c, 0)+1);
        // }
        // for(char c : t.toCharArray()){
        //     if (!map.containsKey(c)) return false;
        //     map.put(c , map.get(c) - 1);
        //     if(map.get(c)==0) map.remove(c);
           
        //     }   return map.isEmpty();  
        if(s.length()!=t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
        }
 }