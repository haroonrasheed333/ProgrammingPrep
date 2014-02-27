package codility;

/**
 * Created by haroon on 2/26/14.
 */
public class MissingElement {
    public static int Solution (int[] a, int[] b) {
        int sum = 0;
        int i;
        for (i = 0; i < b.length; i++) {
            sum += a[i];
            sum -= b[i];
        }
        return sum + a[i];
    }

    public static int Solution1 (int[] a, int[] b) {
        int res = 0;
        int i;
        for (i = 0; i < b.length; i++) {
            res ^= a[i];
            res ^= b[i];
        }
        return res ^ a[i];
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6, 8};
        int[] b = {8, 4, 2, 1};
        System.out.println(Solution1(a, b));
    }
}
