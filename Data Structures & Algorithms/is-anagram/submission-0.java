class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m){
            return false;
        }
        HashMap<Character, Integer> countMap = new HashMap<>();
        for(char c : s.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!countMap.containsKey(c) || countMap.get(c) == 0) {
                return false; 
            }
            countMap.put(c, countMap.get(c) - 1);
        }
        return true;
    }
}