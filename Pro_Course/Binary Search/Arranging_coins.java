class Solution {
    public int arrangeCoins(int n) {
        long low=1;
        long high=n;

        long ans=-1;

        while(low<=high){
            long mid=(high+low)/2;
            
            long coin_req=((mid)*(mid+1))/2;

            if(coin_req==n){
                return (int)mid;
            }else if(coin_req<n){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return (int)ans;
    }
}
