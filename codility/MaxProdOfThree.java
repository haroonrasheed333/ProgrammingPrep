// you can also use imports, for example:
// import java.math.*;
package codility;

class MaxProdOfThree {
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

    public static void main(String[] args) {
        int[] t = {-3,1,2,-2,5,6,1};
        MaxProdOfThree.quickSort(t, 0, t.length - 1);

        int prod1 = t[0]*t[1]*t[2];
        int prod2 = t[0]*t[t.length-1] *t[t.length-2];
        System.out.println( prod1 > prod2 ? prod1:prod2);

    }
}
