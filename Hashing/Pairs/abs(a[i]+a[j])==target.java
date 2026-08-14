/* package whatever; // don't place package name! */
//Count pairs having abs(a[i]+a[j])==target

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
		int target=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		HashMap<Integer,Integer> map=new HashMap<>();
		int count=0;
		for(int j=0;j<n;j++){
			int req1=target-arr[j];
			int req2=-1*(target)-arr[j];
			
			if(map.containsKey(req1)){
				count+=map.get(req1);
			}
			if(map.containsKey(req2)){
				count+=map.get(req2);
			}
			map.put(arr[j],map.getOrDefault(arr[j],0)+1);
			
		}
		
		System.out.println(count);
	}
}
