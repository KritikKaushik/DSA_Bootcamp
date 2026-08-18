class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> present=new HashMap<>();
        HashMap<Integer,Boolean> checked=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            present.put(nums[i],true);
        }
        
        int longest=0;

        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            if(!present.containsKey(a-1) && !checked.containsKey(a)){
                int start=a;
                int currlen=0;
                while(present.containsKey(start)){
                    currlen++;
                    checked.put(start,true);
                    start++;
                }
                longest=Math.max(longest,currlen);
            }
        }
        return longest;
    }
}
