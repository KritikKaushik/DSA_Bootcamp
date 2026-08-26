import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
  public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();// size of array
   
   int[] arr=new int[n]; //actual array
   
   int[] pre=new int[n]; // prefix sum array
   int lar=0;
   for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
       lar=Math.max(lar,arr[i]);
   }
   Arrays.sort(arr);
   pre[0]=arr[0];
   for(int i=1;i<n;i++){
       pre[i]=pre[i-1]+arr[i];
   }
   
   int q=sc.nextInt();// query size
   int target[]=new int[q];// array of all target values
   for(int i=0;i<q;i++){
       target[i]=sc.nextInt();
   }
   
   for(int i=0;i<q;i++){
   	int idx=BS(target[i],arr);
       if(target[i]>lar){//all array elements are smaller than the target
           System.out.print((target[i]*n)-pre[n-1]);
       }else{
           int num=n-idx;
           int right=((pre[n-1]-pre[idx])-(target[i]*num-pre[idx]));
           System.out.println(right);
       }
   }
   
   
  }
  public static int BS(int target,int arr[]){
       int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            
            if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
  }
}

