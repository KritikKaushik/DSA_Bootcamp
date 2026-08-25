import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n + 1];
        int[] b = new int[n + 1];
        Integer[] diff = new Integer[n + 1];

        long constant = 0;

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            diff[i] = a[i] - b[i];
        }

        for (int i = 1; i <= n; i++) {
            long currConst = ((long) b[i] * n) - a[i];
            constant += currConst;
        }

        Arrays.sort(diff, 1, n + 1,Collections.reverseOrder(
        	));

        long totSum = constant;

        for (int j = 1; j <= n; j++) {
            totSum += (long) diff[j] * j;
        }

        System.out.println(totSum);
    }
}
