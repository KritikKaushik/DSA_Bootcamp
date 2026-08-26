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
		long count=0;
		
		long n=sc.nextLong();
		List<Long> p1m =new ArrayList<>();//positive
		List<Long> p2m =new ArrayList<>();//negative
		
		for(long i=1;i<=n;i++){
			long y=sc.nextLong();
			if(y<0){
				p2m.add(Math.abs(y));
			}else{
				p1m.add(y);
			}
		}
		List<Long> p1f =new ArrayList<>();//positive
		List<Long> p2f =new ArrayList<>();//negative
		
		for(long i=1;i<=n;i++){
			long y=sc.nextLong();
			if(y<0){
				p2f.add(Math.abs(y));
			}else{
				p1f.add(y);
			}
		}
		
		if(p1m.size()>0){
			Collections.sort(p1m);
		}
		if(p2m.size()>0){
			Collections.sort(p2m);
		}
		if(p1f.size()>0){
			Collections.sort(p1f);
		}
		if(p2f.size()>0){
			Collections.sort(p2f);
		}
		
		int i=0;
		int j=0;
		////p1m[5,10,15]badi p2m[5 10 15 20]choti
		//p1f[5,10,15]bada p2f[5,10,15,21]choti
		while(i<p1m.size() && j<p2f.size()){
			if(p1m.get(i)<p2f.get(j)){
				count++;
				i++;
				j++;
			}else{
				j++;
			}
		}
		j=0;
		i=0;
		
		// p2m[5 10 15 20]choti i 
		//p1f[5,10,15]bada j
		while(i<p2m.size() && j<p1f.size()){
			if(p2m.get(i) > p1f.get(j)){
				count++;
				i++;
				j++;
			}else{
				i++;
			}
		}
		
	
		System.out.println(count);
		
	}
}
