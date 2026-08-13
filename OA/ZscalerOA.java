/*
Question:--You are given an array “A”; in one step select largest element of array and convert it to second largest element of the array 

-> Tell the minimum number of steps such that all elements become equal */ 

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
		
		int arr[]=new int[n];
		TreeMap<Integer,Integer> map=new TreeMap<>();
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		List<List<Integer>> sets=new ArrayList<>();
		for(int num:map.keySet()){
			 List<Integer> temp = new ArrayList<>();
    		temp.add(num);
    		temp.add(map.get(num));
    		sets.add(temp);
		}
		int steps=0;
		for(int i=sets.size()-1;i>=0;i--){
			int freq=sets.get(i).get(1);
			steps+=freq;
		}
		System.out.println(steps);
		
		
		
		
	}
}
