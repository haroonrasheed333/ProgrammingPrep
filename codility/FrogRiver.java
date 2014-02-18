// you can also use imports, for example:
// import java.math.*;
package codility;

class FrogRiver {
    public int solution(int X, int[] A) {
        // write your code in Java SE 7
        
        boolean[] flag_array = new boolean[X];
        int temp_counter = 0;
        for(int i=0; i<A.length; i++){
            if(!flag_array[A[i]-1]){
                
                temp_counter++;
                flag_array[A[i]-1] = true;
            }
            
            if(temp_counter == X) return i;
        }
                           
        return -1;
    }
}
