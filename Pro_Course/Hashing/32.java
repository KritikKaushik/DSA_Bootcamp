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
		
		int arr[]=new int[n+1];
		
		for(int i=1;i<=n;i++){
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		int count=0;
		for(int i=1;i<=n;i++){
			int RHS=arr[arr[arr[i]]];
			if(map.containsKey(RHS)){
				count+=map.get(RHS);
			}
			map.put(RHS,map.getOrDefault(RHS,0)+1);
			
		}
		System.out.print(count);
	}
}
