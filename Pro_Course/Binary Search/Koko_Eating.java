class Solution {
    public boolean check(int[] piles,long k,long h){
        long sum=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]%k==0){
                sum+=piles[i]/k;
            }else{
                sum+=((piles[i]/k)+1);
            }
            
        }
        return sum<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        long high=-1;


        for(int i=0;i<piles.length;i++)
        {
            high=Math.max(high,(long)piles[i]);
        }

        long low=1;
        long answer=0;
        while(low<=high){
            long mid=(low+high)/2;

            if(check(piles,mid,h)==false){
                low=mid+1;
            }else{
                answer=mid;
                high=mid-1;
            }
        }
        return (int)answer;

    }
}
