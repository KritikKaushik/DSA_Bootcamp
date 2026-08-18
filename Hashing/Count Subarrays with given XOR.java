class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int prexor=0;
        int count=0;
        map.put(0,1);
        for(int j=0;j<arr.length;j++){
            prexor^=arr[j];
            int need=prexor^k;
            if(map.containsKey(need)){
                count+=map.get(need);
            }
            map.put(prexor,map.getOrDefault(prexor,0)+1);
        }
        return count;
    }
}
