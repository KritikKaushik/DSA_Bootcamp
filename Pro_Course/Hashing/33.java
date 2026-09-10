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
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int arr[]=new int[n+1];
		
		for(int i=1;i<=n;i++){
			arr[i]=sc.nextInt();
		}
		int pre[]=new int[n+1];
		pre[1]=arr[1];
		pre[0]=0;
		
		for(int i=2;i<=n;i++){
			pre[i]=pre[i-1]+arr[i];
		}
		
		int suff[]=new int[n+1];
		suff[n]=arr[n];
		suff[0]=0;
		
		for(int i=n-1;i>0;i--){
			suff[i]=suff[i+1]+arr[i];
		}
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<=k;i++){
			int left=i;
			int right=k-i;
			int sum=pre[left];
			if(right>0){
				sum+=suff[n-right+1];
			}
			
			ans=Math.max(ans,sum);
			
		}
		System.out.print(ans);
	}
}
