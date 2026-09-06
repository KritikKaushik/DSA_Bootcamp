class Solution {
    public int[] singleNumber(int[] nums) {
        long xor=0;
        for(int n:nums){
            xor^=n;
        }
        int groupA=0;
        int groupB=0;

        int mask=(int)(xor & (-xor));

        for(int n:nums){
            if((mask & n)==0){
                groupA^=n;
            }else{
                groupB^=n;
            }
        }
        int ans[]=new int[2];
        ans[0]=groupA;
        ans[1]=groupB;

        return ans;
    }
}

//take xor of all elements,
//now find the bit which is different in both number
// divide them into 2 groups and answer is the seperate xor of those group.
