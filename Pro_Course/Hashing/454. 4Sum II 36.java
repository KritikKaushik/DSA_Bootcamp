class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                int sum=nums1[i]+nums2[j];
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        int count=0;

        for(int k=0;k<nums1.length;k++){
            for(int l=0;l<nums2.length;l++){
                int sum=nums3[k]+nums4[l];
                if(map.containsKey(-sum)){
                    count+=map.get(-sum);
                }
            }
        }
        return count;
    }
}
