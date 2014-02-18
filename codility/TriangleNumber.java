// you can also use imports, for example:
// import java.math.*;
package codility;

class TriangleNumber {
       public static void quickSort(int[] arr,int left,int right) {
        int i = left, j = right;
        int pivot = arr[(i+j) / 2];
        while (i <= j) {
            while (arr[i] > pivot)
                i++;
            while (arr[j] < pivot)
                j--;

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }
        }

        if (left < j)
            quickSort(arr, left, j);
        if (i < right)
            quickSort(arr, i, right);


    }

    
    public int solution(int[] t) {
        
        if(t.length >3)
        // write your code in Java SE 7
            Solution.quickSort(t, 0, t.length - 1);

        for(int i=0;i<t.length-2;i++){
            if(t[i] > 0 && t[i+1] >0 && t[i+2] >0 ){
                long p = (long)t[i];
                long q = (long)t[i+1];
                long r = (long)t[i+2];

                if(p + q > r && p+r > q && q+r > p){
                    return 1;

                }
            }
        }
        return 0;
    }
}
