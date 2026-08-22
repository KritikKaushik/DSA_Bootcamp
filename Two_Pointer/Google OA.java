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
		int k=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		int len=0;
		TreeMap<Character,Integer> st=new TreeMap<>();
		
		int low=0;
		for(int high=0;high<s.length();high++){
			st.put(s.charAt(high),st.getOrDefault(s.charAt(high),0)+1);
			int diff=st.lastKey()-st.firstKey();
			
			while(diff>k){
				st.put(s.charAt(low),st.get(s.charAt(low))-1);
				if(st.get(s.charAt(low))==0){
				st.remove(s.charAt(low));	
				}
				
				low++;
				diff=st.lastKey()-st.firstKey();
			}
			len=Math.max(len,(high-low+1));
		}
		System.out.println(len);
	}
}




//Used two pointer pattern and a sorted treemap to know the max and min element in any subarray in O(log n) time along with maintaining the
//duplicate elements dont get removed which are present in substring but not in sorted map......
// eg aaaaa here if we do remove then all a will be removed
