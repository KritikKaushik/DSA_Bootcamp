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
		int slen=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			sum+=arr[i];
			int need=k-sum;
			if(map.containsKey(need)){
				int len=i-map.get(need);
				slen=Math.min(len,slen);
			}
			map.put(sum,i);
		}
		if(slen==Integer.MAX_VALUE){
			System.out.print("-1");
		}
		int i=0;
		int j=0;
		sum=0;
		int count=0;
		while(j<slen){
			sum+=arr[j];
			j++;
		}
		while(j<n){
			if(sum==k){
				count++;
			}
			sum-=arr[i];
			i++;
			j++;
			if(j<n){
			sum+=arr[j];	
			}
			
		}
		System.out.print(count);
		
		
	}
}
