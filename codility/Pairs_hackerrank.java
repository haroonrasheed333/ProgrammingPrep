package  codility;

import java.util.HashMap;

// you can also use imports, for example:
// import java.math.*;
public class Pairs_hackerrank {
    public  static int solution(int N, int[] A) {
        // write your code in Java SE 7
        HashMap<Integer, Integer> lookup = new HashMap<Integer, Integer>();
        int ret_val = 0;
        for(int i=0;i<A.length;i++){
            if(!lookup.containsKey(A[i])){
                    lookup.put(A[i],A[i]-N);
            }

        }

       for(int t:lookup.values()){
           if(lookup.containsKey(t)) ret_val+=1;
       }

        return ret_val;
    }

    public static void main(String[] args) {
        int[] t = {1,5,3,4,2 };
        int ans = Pairs_hackerrank.solution(2,t);
        System.out.print(ans);

    }
}
