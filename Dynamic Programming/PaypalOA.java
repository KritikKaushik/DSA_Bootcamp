/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		int k=sc.nextInt();
		int n=s.length();
		int dp[]=new int[n];
		dp[0]=1;
		int ans=1;
		for(int i=1;i<n;i++){
			if(Math.abs(s.charAt(i)-s.charAt(i-1))<=k){
				dp[i]=dp[i-1]+1;
			}else{
				dp[i]=1;
			}
			ans=Math.max(ans,dp[i]);
		}
		StringBuilder an=new StringBuilder();
		for(int i=0;i<ans;i++){
			an.append(s.charAt(i));
		}
		System.out.println(an);
	}
}
