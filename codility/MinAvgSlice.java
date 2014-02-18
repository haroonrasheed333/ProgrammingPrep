// you can also use imports, for example:
// import java.math.*;
package codility;

public class MinAvgSlice {
    public int solution(int[] A) {
        // write your code in Java SE 7
        double min_avg = (A[0] + A[1])/2.0;
        int min_pos = 0;

        for(int i =0;i<A.length - 2; i++){
           double two_slice_min = (A[i] + A[i+1] )/ 2.0;
           double three_slice_min = (A[i] + A[i+1] + A[i+2]) / 3.0;
           if(two_slice_min < min_avg){
               min_avg  =two_slice_min;
               min_pos = i;
           }
            if(three_slice_min < min_avg){
                min_avg = three_slice_min;
                min_pos = i;
            }
        }

        double last_slice =(A[A.length -2] + A[A.length -1]) / 2.0;
        if(last_slice < min_avg) return A.length - 2;
        else return  min_pos;
    }
}
