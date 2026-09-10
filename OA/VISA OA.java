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
		System.out.println("Visa OA 10 September 2026");
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		int p[]=new int[1000000+30];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			p[arr[i]]++;
		}
		int moves=0;
		int carry=0;
		for (int i = 0; i < p.length; i++) {
            int ones = p[i] + carry;
            p[i] = ones % 2;   
            carry = ones / 2;
 
            if (p[i] == 1) {
                moves++;
            }
        }
        
        //corner case where array will go out of bound like index 0 had value greater than 1.
        while(carry>0){
        	 if(carry%2==0){
        	 	moves++;
        	 }
        	 carry/=2;
        }
        System.out.println(moves);
        
        
		
		
		
	}
}
