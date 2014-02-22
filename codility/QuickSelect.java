package codility;

/**
 * Created by haroon on 2/21/14.
 */
public class QuickSelect {
    public static int QSelect (int[] arr, int start, int end, int k) {
        int pivot = (start + end) / 2;
        int i = start, j = end;

        while (i < j) {
            while (arr[i] > arr[pivot])
                i++;
            while (arr[j] < arr[pivot])
                j--;

            if (arr[i] == arr[j])
                i++;

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int length = j - start + 1;

        if (length == k)
            return arr[j];

        if (length < k)
            return QSelect(arr, j+1, end, k-length);
        else
            return QSelect(arr, start, j-1, k);
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 5, 2, 4, 8, 6};
        System.out.println(QSelect(a, 0, a.length - 1, 2));
    }
}
