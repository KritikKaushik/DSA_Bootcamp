import java.util.*;
import java.lang.*;
import java.io.*;
 
class Ideone {
    public static void main(String[] args) throws java.lang.Exception {
        int largest = 0;
        int sum = 0;
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            largest = Math.max(largest, arr[i]);
        }
 
        if (largest >= sum / 2) {
            System.out.println(largest);
            return;
        }
 
        System.out.println(Math.ceil(sum / 2.0));
    }
}
