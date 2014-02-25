package codility;

/**
 * Created by haroon on 2/21/14.
 */
public class QuickSelect {
    public static int Partition (int[] arr, int start, int end) {
        int pivot = (start + end) / 2;
        int i = start, j = end;

        while (i <= j) {
            while (arr[i] > arr[pivot])
                i++;
            while (arr[j] < arr[pivot])
                j--;

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return pivot;

    }

    public static int quickSelect(int items[], int first, int last, int k) {
        int pivot = Partition(items, first, last);
        if (k < pivot) {
            return quickSelect(items, first, pivot, k);
        } else if (k > pivot) {
            return quickSelect(items, pivot+1, last, k-pivot);
        } else {
            return items[k];
        }
    }



    public static void main(String[] args) {
        int[] a = {3, 1, 5, 2, 4, 8, 6};
        System.out.println(quickSelect(a, 0, a.length - 1, 3));
    }
}
