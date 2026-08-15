/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void countLongestSumk(int nums[],int k){
		int maxSize=0;
		int count=0;
		for(int i=0;i<nums.length;i++){
			for(int j=i;j<nums.length;j++){
				sum+=nums[j];
				if(sum%k==0){
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int nums[]={3,2,3,1,1,3,2};
		countLongestSumk(nums,2);
		
	}
}
