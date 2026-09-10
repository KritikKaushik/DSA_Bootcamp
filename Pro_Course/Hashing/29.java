/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int convert(String s){
		int h1=s.charAt(0)-'0';
		int h2=s.charAt(1)-'0';
		int time=(h1*10+h2)*60;
		int m1=s.charAt(3)-'0';
		int m2=s.charAt(4)-'0';
		time+=(m1*10+m2);
		return time;
	}
	
	 static void printInt(int g) {
        int u = g / 60;
        int y = g % 60;
 
        if (u <= 9) {
            System.out.print("0");
            System.out.print(u);
        } else {
            System.out.print(u);
        }
        System.out.print(":");
 
        if (y <= 9) {
            System.out.print("0");
            System.out.print(y);
        } else {
            System.out.print(y);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int k = sc.nextInt();
 
        int[] h = new int[1441];
 
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();
            String v1 = sc.next();
            String v5 = sc.next();
 
            int t1 = convert(v1);
            int t5 = convert(v5);
 
            h[t1]++;
            h[t5 + 1]--;
        }
        int[] pre=new int[1441];
        pre[0]=h[0];
        for(int i=1;i<=1440;i++){
        	pre[i]=pre[i-1]+h[i];
        }
        
        int count=0;
        boolean found=false;
        for(int i=0;i<=1440;i++){
        	if(pre[i]==0){
        		count++;
        	}else{
        		count=0;
        	}
        	if(count==k){
        		found=true;
        		printInt(i-k+1);
        		break;
        	}
        	
        }
        if(found==false){
        	System.out.print("-1");
        }
        
	}
}
