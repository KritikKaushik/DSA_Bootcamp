import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    
    int b[]=new int[n+1];
    
    for(int i=1;i<=n;i++){
      b[i]=sc.nextInt();
    }
    
    int dp[]=new int[n+1];
    
    dp[1]=0;
    dp[2]=Math.abs(b[1]-b[2]);
    
    for(int i=3;i<=n;i++){
      dp[i]=Math.min(dp[i-1]+Math.abs(b[i]-b[i-1]),dp[i-2]+Math.abs(b[i]-b[i-2]));
    }
    System.out.println(dp[n]);
  }
}
