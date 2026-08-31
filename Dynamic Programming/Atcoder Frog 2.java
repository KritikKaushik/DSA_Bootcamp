import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    int k=sc.nextInt();
    
    int b[]=new int[n+1];
    
    for(int i=1;i<=n;i++){
      b[i]=sc.nextInt();
    }
    
    int dp[]=new int[n+1];
    
    dp[1]=0;
    dp[2]=Math.abs(b[1]-b[2]);
    
    for(int i=3;i<=n;i++){
      int answer=Integer.MAX_VALUE;
      
      int j=1;
      while((i-j)>=1 && j<=k){
        //i.....j dp[i-j]?
        int option=dp[i-j]+Math.abs(b[i]-b[i-j]);
        answer=Math.min(answer,option);
        j++;
      }
      dp[i]=answer;
    }
    System.out.println(dp[n]);
  }
}
