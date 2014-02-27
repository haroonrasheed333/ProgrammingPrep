package codility;

/**
 * Created by rahmanaicc on 2/25/14.
 */
public class SortZeroOne {

    public static void Sort(int[] a){
        int i =0;
        int j = a.length -1 ;

        while(i < j){
            while(a[i] == 0 && i < j){
                i++;
            }
            while(a[j] == 1 && j > i){
                j--;
            }

            if(i <j){
                a[i] = a[i] == 1 ? 0 :1;
                a[j] = a[j] == 1 ? 0 :1;

            }
        }
    }


    public static void main(String[] args) {
        int[] a = {1,0,1,0,1,0};
        Sort(a);
        System.out.print("done");

    }
}
