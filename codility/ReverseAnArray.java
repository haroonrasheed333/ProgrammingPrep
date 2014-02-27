package codility;

/**
 * Created by rahmanaicc on 2/24/14.
 */
public class ReverseAnArray {
    public static void Reverse(int[] a){

        for(int i=0,j=a.length-1; i<j;i++,j--){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        ReverseAnArray.Reverse(a);
        System.out.print("done");
    }

}
