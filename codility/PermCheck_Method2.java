// you can also use imports, for example:
// import java.math.*;
package codility;


class PermCheck_Method2 {
    public int solution(int[] A) {
        // write your code in Java SE 7
        int len = A.length, i, j;
        boolean[] temp = new boolean[len];
        
        for (i = 0; i < len; i++) {
            if (A[i] > len)
                return 0;
            else if (temp[A[i]-1])
                return 0;
            temp[A[i]-1] = true;
        }
        
        for (j = 0; i < len; j++) {
            if (temp[j] == false) 
                return 0;
        }
        
        return 1;
    }
}