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
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		
		map.put(0,-1);
		int sum=0;
		int slen=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			sum+=arr[i];
			int need=sum-k;
			if(map.containsKey(need)){
				int len=i-map.get(need);
				slen=Math.max(len,slen);
			}else{
				map.put(sum,i);
			}
			
		}
		if(slen==Integer.MIN_VALUE){
			System.out.print("-1");
		}
		int i=0;
		sum=0;
		int count=0;
		for(int j=0;j<slen;j++){
			sum+=arr[j];
		}
		for(int j=slen;j<n;j++){
			if(sum==k){
				count++;
			}
			sum+=arr[j];
			sum-=arr[i];
			i++;
		}
		System.out.print(count);
		
		
	}
}
