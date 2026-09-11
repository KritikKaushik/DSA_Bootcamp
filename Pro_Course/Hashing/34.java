import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long[] a = new long[(int) n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
        }

        long t = sc.nextLong();
        long answer = 0;

        if (t % 2 == 0) {
            long positive = t / 2;
            long negative = -positive;

            long c1 = 0, c2 = 0, c5 = 0, c8 = 0;

            for (int i = 1; i <= n; i++) {
                if (a[i] == positive) c1++;
                if (a[i] == negative) c2++;

                if (a[i] >= 0 && a[i] < positive) c5++;

                if (a[i] < 0 && a[i] > negative) c8++;
            }

            answer += (c1 * (c1 - 1)) / 2;
            answer += (c2 * (c2 - 1)) / 2;
            answer += c1 * c5;
            answer += c2 * c8;
            answer += c1 * c8;
            answer += c2 * c5;
        } else {

        }

        System.out.print(answer);
    }
}
