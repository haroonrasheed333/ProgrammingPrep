// you can also use imports, for example:
// import java.math.*;
class Solution {
    public int solution(int[] A) {
        
        int length = A.length;
        int[] temp = new int[2*A.length];
        int tmp = 0;
        
        for(int i=0;i<2*length;i++){
            if(i < length) { 
                temp[i] = i+1;  
            }
            else{
                temp[i] = A[tmp++];
            }
        }
        
        int xx = 0;
        for(int i=0;i <2*A.length;i++){
            xx ^= temp[i];
        }
        
        if(xx == 0) return 1;
        else return 0;
        
        
        
        
    }
}
