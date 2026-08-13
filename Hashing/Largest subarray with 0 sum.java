class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();//stores sum,firstOccurance
        
        int maxLen=0;
        int sum=0;
        
        map.put(0,-1);//as sum 0 comes before starting of array
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];//calculate running sum
            if(map.containsKey(sum)){//if map already have the sum before then the 
                int len=i-map.get(sum);
                maxLen=Math.max(maxLen,len);
            }else{
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}
