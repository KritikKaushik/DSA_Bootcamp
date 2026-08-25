class Solution {
    public long minDamage(int power, int[] damage, int[] health) {
        int n=health.length;
        int[] time=new int[n];
        for(int i=0;i<n;i++){
            time[i]=(int)Math.ceil((double) health[i]/power);
        }

        List<Pair> ratio=new ArrayList<>();

        for(int i=0;i<n;i++){
            double dbym=(double)damage[i]/time[i];
            ratio.add(new Pair(dbym,i));
        }
        ratio.sort((a,b)->Double.compare(a.mval,b.mval));

        long totsum=0;
        for(int d:damage){
            totsum+=d;
        }
        long ans=0;
        for(int i=ratio.size()-1;i>=0;i--){
            int idx=ratio.get(i).index;
            int sec_damage_given=time[idx];
            ans+=(totsum*sec_damage_given);
            totsum-=damage[idx];
        }
        return ans;
        
    }
}
class Pair{
    double mval;
    int index;

    Pair(double mval,int index){
        this.mval=mval;
        this.index=index;
    }
}
