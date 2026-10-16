/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static int lower(int[] arr,int ele){
		int low=0;
		int high=arr.length-1;
		
		int first=-1;
		while(low<=high){
			int mid=(low+high)/2;
			
			if(arr[mid]==ele){
				first=mid;
				high=mid-1;
			}else if(arr[mid]>ele){
				high=mid-1;
			}else{
				low=mid+1;
			}
			
		}
		return first;
	}
	
		public static int upper(int[] arr,int ele){
		int low=0;
		int high=arr.length-1;
		
		int last=-1;
		while(low<=high){
			int mid=(low+high)/2;
			
			if(arr[mid]==ele){
				last=mid;
				low=mid+1;
			}else if(arr[mid]>ele){
				high=mid-1;
			}else{
				low=mid+1;
			}
			
		}
		return last;
	}
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
		
		int low=0;
		int high=n-1;
		
		while(low<=high){
			int mid=(low+high)/2;
			
			int l1=lower(arr,arr[mid]);
			int h1=upper(arr,arr[mid]);
			
			if((h1-l1+1)<k){
				System.out.print(arr[mid]);
				break;
			}else{
				if((h1-low+1)%k==0){
					low=h1+1;
				}else{
					high=l1-1;
				}
			}
		}
		
	}
}
