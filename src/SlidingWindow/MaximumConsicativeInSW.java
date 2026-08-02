package SlidingWindow;
import java.util.*;
public class MaximumConsicativeInSW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int maxlength = 0;
        int l = 0, r = 0, zeros = 0;
        while (r < n) {
            if (a[r] == 0) {
                zeros++;
            }
            //this is for o(n) and if we use while it will be o(2n);
            if (zeros > k) {
                if (a[l] == 0) {
                    zeros--;
                }
                l++;
            }
            if (zeros <= k) {
                int len = r - l + 1;
                maxlength = Math.max(maxlength, len);
            }
            r++;
        }
        System.out.println(maxlength);
    }
}
