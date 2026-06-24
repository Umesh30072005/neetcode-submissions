class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length == 0) return 0;
       Set<Integer> hs = new HashSet<>();
       for(int num : nums){
        hs.add(num);
       } 
       int count = 1;
       for(int num : nums){
        int prev = num -1;
        if(hs.contains(prev)) continue;
        else{
            int next = num +1;
            while(hs.contains(next)){
                next = next+1;
            }
            count = Math.max(count,next - num);
        }
       }
       return count;
    }
}
