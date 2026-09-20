class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int j=1;
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'a'+1;
            int revind=26-ch+1;
            sum+=(j*revind);
            j++;
        }
        return sum;
    }
}
