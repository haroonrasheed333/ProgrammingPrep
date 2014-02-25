package codility;

/**
 * Created by rahmanaicc on 2/24/14.
 */
public class PairsWithSumK {
    public static void quickSort(int[] arr,int left,int right) {
        int i = left, j = right;
        int pivot = arr[(i+j) / 2];
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
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

    public static void Solution(int[] a, int k){

        int i =0, j =a.length-1;

        while(i<j){

            while(a[i] + a[j] >= k){
                if(a[i] + a[j] == k) {
                    System.out.println(a[i] + " " + a[j]);

                    break;
                }
                j--;
            }
            i++;

        }

    }

    public static void main(String[] args) {
        int[] a = {3,4,2,1,6,5,8,7};
        quickSort(a, 0, a.length - 1);
        PairsWithSumK.Solution(a,7);
    }
}
