package codility;

/**
 * Created by haroon on 2/26/14.
 */
public class PrintMatrix {
    public static void Solution(int[][] array)
    {
        if(array == null)
        {
            return ;
        }
        int rowCount = array.length;
        int columnCount = array[1].length;
        for(int i=0 ;i<rowCount ; i++)
        {
            int k =0;
            int v = i;
            while(v!= -1 && k <= i)
            {
                System.out.print(array[k][v]);
                v--;
                k++;
            }
            System.out.println();
        }

        for(int i = 1 ; i< columnCount ; i++)
        {
            int k = i;
            int v = rowCount-1 ;
            while(k<rowCount)
            {
                System.out.print(array[k][v]);
                k++;
                v--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1 ,2, 3, 4,6},
                        {5, 4, 3, 5,7},
                        {6, 5, 9, 8,9},
                        {9, 8, 7, 6,1},
                        {1, 8, 3, 6,2}};
        Solution(array);
    }
}
