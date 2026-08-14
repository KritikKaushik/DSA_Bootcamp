/* package whatever; // don't place package name! */
//Count pairs having (a[i]+a[j])%k==0

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
		int count=0;
		for(int j=0;j<n;j++){
			int have=arr[j]%k;
			int need=k-have;
			need=need%k;
			if(map.containsKey(need)){
				count+=map.get(need);
			}
		
			map.put(have,map.getOrDefault(have,0)+1);
			
		}
		
		System.out.println(count);
	}
}
