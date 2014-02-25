package codility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by rahmanaicc on 2/24/14.
 */
public class EncryptionHackerRank {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();
        int len = inp.length();

        int MinCols = (int) Math.floor(Math.sqrt(len));
        int MaxRows = (int) Math.ceil(Math.sqrt(len));


        while(true){

            while (MaxRows > MinCols){
                MinCols ++;
                if(MinCols == MaxRows && MaxRows*MinCols >= len) break;
                else MaxRows --;
            }

            if(MaxRows * MinCols >= len){
                break;
            }
            else{
                MinCols ++;
                //MaxRows --;
            }
        }

        for(int i=0;i<MinCols;i++){
            for(int j=0;(i+j)<len;j+=MinCols)
                System.out.print(inp.charAt(i+j));
            System.out.print(" ");
        }







    }
}
