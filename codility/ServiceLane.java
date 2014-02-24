package codility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by rahmanaicc on 2/23/14.
 */
public class ServiceLane {
    public static void main(String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String[] inp_tok= obj.readLine().split(" ");
        String[] inp_arr = obj.readLine().split(" ");
        int[] width = new int[Integer.parseInt(inp_tok[0])];
        for(int i=0; i< Integer.parseInt(inp_tok[0]); i++){
            width[i] = Integer.parseInt(inp_arr[i]);
        }

        for(int i=0;i <Integer.parseInt(inp_tok[1]); i++){
            String[] ind = obj.readLine().split(" ");
            int ind_1 = Integer.parseInt(ind[0]);
            int ind_2 = Integer.parseInt(ind[1]);
            int min = width[ind_2];
            for(int j=ind_2-1; j>= ind_1; j--){
                if(width[j] < min) min = width[j];
            }
            System.out.println(min);
        }
    }
}
