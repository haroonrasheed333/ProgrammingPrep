package codility;

/**
 * Created by rahmanaicc on 2/24/14.
 */
public class OccurrencesOfNumberInSortedArray {

    public static int Solution(int[] a,int start,int end, int k){
        if(k < a[start]) return 0;
        if(k > a[end]) return  0;
        if(k == a[start] && k == a[end]) return end-start +1;
        int mid = (start + end) / 2;
        if(k == a[mid]) return 1 + Solution(a,start, mid-1,k) + Solution(a,mid+1,end,k);
        if(k > a[mid]) return Solution(a,mid+1,end,k);
        else return Solution(a,start,mid-1,k);


    }

    public static void main(String[] args) {
        int[] a = {1,1,2,2,2,2,2,3,3,3,3,3,3,3,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,6,6,6,6,6,6,6,6};
        System.out.print(OccurrencesOfNumberInSortedArray.Solution(a, 0, a.length - 1, 1));
    }


}
