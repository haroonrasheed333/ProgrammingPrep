package codility;

/**
 * Created by rahmanaicc on 2/26/14.
 */
public class RotatedSortedArraySearch {
    public static int Search(int[] a, int start, int end, int k){

        int mid = (start + end)/ 2;
        if(a[mid] == k) return mid;
        if(a[mid] < a[end])
        {

          if(k > a[mid] && k <= a[end]){
           return Search(a, mid + 1, end, k);
          }

            else if (k > a[end]){
                return Search(a, start, mid-1,k);
            }
        }
        else if(a[mid] > a[start]){
            if(k < a[mid] && k >= a[start]  ){
                return Search(a,start,mid-1, k);
            }
            else{
                return Search(a,mid+1,end, k);
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {8,9,1,2,3,4,5,6,7};
        System.out.print(RotatedSortedArraySearch.Search(a,0,a.length-1,8));

    }
}
