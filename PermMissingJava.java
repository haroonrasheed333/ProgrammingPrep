// you can also use imports, for example:
import java.math.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 7
        long length = A.length;
        long sum_n = ((length+1)*(length+2)) / 2;
        int sum = 0;
        for(int i =0; i< length; i++){
            sum += (A[i]);
        }
        return (int)(sum_n - sum);
        
    }
}