class Solution {
    public static boolean digitSum(int n,int index){
        int sum=0;
        while(n>0){
            int digit=n%10;
            n/=10;
            sum+=digit;
        }
        if(sum==index){
            return true;
        }
        return false;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(digitSum(nums[i],i)==true){
                return i;
            }
        }
        return -1;
    }
}
