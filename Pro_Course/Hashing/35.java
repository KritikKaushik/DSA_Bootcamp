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
		
		String a=sc.next();
		String b=sc.next();
		
		HashMap<Character,Integer> mape=new HashMap<>();
		HashMap<Character,Integer> mapo=new HashMap<>();
		
		for(int i=0;i<a.length();i++){
			char ch1=a.charAt(i);
			char ch2=b.charAt(i);
			
			if(i%2==0){
				mape.put(ch1,mape.getOrDefault(ch1,0)+1);
				mape.put(ch2,mape.getOrDefault(ch2,0)-1);
			}else{
				mapo.put(ch1,mapo.getOrDefault(ch1,0)+1);
				mapo.put(ch2,mapo.getOrDefault(ch2,0)-1);
			}
		}
		for(char ch:mape.keySet()){
			if(mape.get(ch)!=0){
				System.out.print("false");
				return;
			}
		}
		for(char ch:mapo.keySet()){
			if(mapo.get(ch)!=0){
				 System.out.print("false");
				 return;
			}
		}
		System.out.print("true");
	}
}
