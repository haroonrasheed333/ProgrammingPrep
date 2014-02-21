package codility;

/**
 * Created by haroon on 2/21/14.
 */
public class BinarySearchArray {
    public static int search (int[] arr, int start, int end, int n) {
        int mid = (start + end) / 2;
        if (start == end) {
            if (arr[start] == n)
                return start;
            else
                return -1;
        }

        if (arr[mid] == n) {
            return mid;
        }

        if (arr[mid] < n) {
            return search(arr, mid+1, end, n);
        }
        else {
            return search(arr, start, mid - 1, n);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(BinarySearchArray.search(a, 0, a.length - 1, 3));
    }
}
