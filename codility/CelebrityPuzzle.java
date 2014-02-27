package codility;

/**
 * Created by rahmanaicc on 2/25/14.
 */
public class CelebrityPuzzle {


    //public static int[][] celeb_mat = {{0,0,1,0},{0,0,1,0},{0,0,0,0},{0,0,1,0}};
    public static int[][] celeb_mat = {{0,0,0,1,0},{0,0,0,1,0},{0,0,0,1,0},{0,0,0,0,0},{0,0,0,1,0}};

    //public static int[][] celeb_mat = {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,1,0,0}};

    //public static int[][] celeb_mat = {{0,0,0,0},{1,0,0,0},{1,0,0,0},{1,0,0,0}};


    public static int FindCelebrity(int n){
        int i =0;
        int j = 1;
        while(i <n  && j < n){
            if(celeb_mat[i][j] == 1 && celeb_mat[j][i] ==0) {
                if(j+1 >=n) return j;
                i = j;
                j++;
            }
            else if(celeb_mat[i][j] == 1 && celeb_mat[j][i] ==1) {
                if(j+1 >= n) return j+1;
                i = j+1;
                j++;
            }
            else if(celeb_mat[i][j] == 0 && celeb_mat[j][i] ==0) {
                if(j+2 >= n) return n;
                i = j+1;
                j+=2;
            }
            else if(celeb_mat[i][j] == 0 && celeb_mat[j][i] ==1) {
                if(j +1 >=n ) return i;
                j++;
            }

            }
        return 0;

        }


    public static void main(String[] args) {
        System.out.print(FindCelebrity(5));
    }

}
