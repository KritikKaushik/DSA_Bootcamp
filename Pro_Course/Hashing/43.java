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
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			b[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int y=sc.nextInt();
		int pre[]=new int[n];
		
		for(int i=0;i<n;i++){
			if((i-y)>=0){
				pre[i]=pre[i-y]+b[i];
			}else{
				pre[i]=b[i];
			}
		}
		int ans=Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++){
			int index=i-((x-1)*y);
			if(index>=0){
			int g=pre[i];
			if(index-y>=0){
				g-=pre[index-y];
			}	
			ans=Math.min(ans,g);
			}
			
		
		}
		System.out.print(ans);
	}
}
