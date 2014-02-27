package codility;

/**
 * Created by rahmanaicc on 2/25/14.
 */
public class MergeSortedArrays {

    public static void Merge(int[] a, int[] b){

        int i =  a.length - b.length - 1;
        int j = b.length - 1;

        int temp = a.length - 1;

        while(i >= 0 && j >=0){
            if( a[i] > b[j]){

                a[temp] = a[i];
                temp --;
                i--;

            }
            else {
                a[temp] = b[j];
                temp--;
                j--;
            }


        }

        while(i >=0){
            a[temp] = a[i];
            i--;
            temp--;
        }


        while(j >=0){
            a[temp] = a[j];
            j--;
            temp--;
        }


    }
    public static void main(String[] args) {

        int[] a=  {1,3,5,7,0,0,0,0};
        int[] b = {2,4,6,8};
        Merge(a,b);
        System.out.print("done");

    }
}
