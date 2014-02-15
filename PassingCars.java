// you can also use imports, for example:
// import java.math.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 7
        long ret_val = 0;
        long num_zero = 0;
        for(int i=0 ;i < A.length; i++){
            if(A[i] == 0) { num_zero += 1;}
            else { ret_val += num_zero; }
        }
        
        return (ret_val>1000000000) ? -1: (int)ret_val;
    }
}