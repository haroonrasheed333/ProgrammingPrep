package codility;

/**
 * Created by haroon on 2/24/14.
 */
import java.util.Arrays;

public class QuickSelect1
{
    public static void swap(int[] data, int i, int j)
    {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static int partition(int[] data, int first, int last)
    {
        int pivot = data[first];
        int left = first, right = last;

        while (left < right)
        {
            // Search for an element bigger than the pivot from the left part
            while (data[left] <= pivot && left < right)
                left++;

            // Search for an element smaller than the pivot from the right part
            while (data[right] > pivot)
                right--;

            // Swap the two elements found
            if (left < right)
                swap(data, left, right);
        }

        // move the pivot element to its final position (in the middle)
        swap(data, first, right);
        return right;
    }

    public static int quickSelect(int[] data, int first, int last, int k)
    {
        if (first >= last)
            return first;

        // Pick up a random pivot and swap it to the first position
        int r = (int) (Math.random() * (last - first + 1)) + first;
            swap(data, first, r);

        int pivot = partition(data, first, last);

        // intermediate result
        //System.out.println(Arrays.toString(data) + " first: " + first + " last: " + last + " pivot: " + pivot + " k: " + k);

        int len = pivot - first;		// length of the left part

        if (len > k)
            return quickSelect(data, first, pivot - 1, k);

        if (len < k)
            return quickSelect(data, pivot + 1, last, k - len - 1);

        // pivot - first == k
        return pivot;
    }

    public static void main(String[] args)
    {

        int[] array = {3, 1, 5, 2, 4, 8, 6};
        System.out.println("begin with: \n" + Arrays.toString(array));
        System.out.println("------------------");

        int ind;
        ind = quickSelect(array, 0, array.length - 1, 6);
           System.out.println( "1st smallest = " + array[ind]);
//        ind = quickSelect(array, 0, array.length - 1, 1);
//        System.out.println( "2nd smallest = " + array[ind]);
//        ind = quickSelect(array, 0, array.length - 1, 2);
//        System.out.println( "3rd smallest = " + array[ind]);
//        ind = quickSelect(array, 0, array.length - 1, 6);
//        System.out.println( "7th smallest = " + array[ind]);

//
//
//        int[] array2 = { 407, 766, 237, 761, 832, 1655, 421, 145, 688, 994, 915,
//                953, 910, 838, 201, 571, 842, 307, 43, 79, 473, 182, 421, 7122, 140,
//                8452, 376, 304, 546, 743, 5, 394, 672, 8439, 684, 223, 50, 601, 122,
//                767, 853, 120, 294, 818, 1986, 130, 947, 389, 93, 88, 487, 403, 943,
//                973, 359, 226, 228, 408, 913, 743, 458, 867, 335, 885, 19, 606, 282,
//                655, 470, 599, 975, 984, 693, 734, 827, 878, 840, 618, 336, 638, 37,
//                41, 552, 287, 20, 253, 288, 907, 111, 883, 73, 473, 762, 4, 11, 42 };
//
//        ind = quickSelect(array2, 0, array2.length - 1, 0);
//        System.out.println( "1st smallest = " + array2[ind]);




    }
}

