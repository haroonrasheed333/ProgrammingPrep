// you can also use imports, for example:
// import java.math.*;
package codility;

class TapeEquilibrium {
    public int solution(int[] A) {
        // write your code in Java SE 7
        int[] temp = new int[A.length];
        int sum = 0;
        for(int i=0;i<A.length;i++){
            sum += A[i];
            temp[i] = sum;

        }
        int min_diff = 0;
        for(int i=0;i<A.length-1;i++){
            int diff = Math.abs(temp[i] - (sum-temp[i]));

            if(diff == 0) return diff;

            else {
                if(i ==0) { min_diff = diff; }
                else { if(diff< min_diff) min_diff = diff;}
            }

        }
        return min_diff;
    }


}
