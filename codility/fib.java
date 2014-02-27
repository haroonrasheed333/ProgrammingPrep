package codility;

/**
 * Created by rahmanaicc on 2/25/14.
 */
public class fib {
    public static long fib(int n)
    {
        long[] f = new long[n+1];
        int i;

        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.print(fib(n));

    }
}
