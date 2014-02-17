import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// you can also use imports, for example:
// import java.math.*;
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String[] tok = obj.readLine().split(" ");
        int[] input_array = new int[Integer.parseInt(tok[0])];
        int k = Integer.parseInt(tok[1]);

        int q = Integer.parseInt(tok[2]);

        String[] arr_elts = obj.readLine().split(" ");

        for(int i=0;i<arr_elts.length;i++){
            input_array[i] = Integer.parseInt(arr_elts[i]);
        }
        int len = input_array.length;
        int num_rot = k%len;

        for(int i=0;i<q;i++){
            int x = Integer.parseInt(obj.readLine());
            if(x - num_rot >= 0){
                System.out.println(input_array[x-num_rot]);
            }
            else{
                System.out.println(input_array[ len + (x-num_rot)]);
            }
        }


    }
}