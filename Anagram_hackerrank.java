package com.example.helloworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by haroon on 2/15/14.
 */
public class Anagram {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num_inputs = Integer.parseInt(br.readLine());
        int i, j;

        for (i = 0; i < num_inputs; i++) {
            String input_string = br.readLine();
            int diff = 0;
            HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
            if (input_string.length() % 2 > 0) System.out.println(-1);
            else {
                for (j = 0; j < input_string.length()/2; j++) {
                    if (hashmap.containsKey(input_string.charAt(j) - 'a')) {
                        hashmap.put(input_string.charAt(j) - 'a', hashmap.get(input_string.charAt(j) - 'a') + 1);
                    }
                    else {
                        hashmap.put(input_string.charAt(j) - 'a', 1);
                    }

                }
                for (j = input_string.length()/2; j < input_string.length(); j++) {
                    if (hashmap.containsKey(input_string.charAt(j) - 'a')) {
                        hashmap.put(input_string.charAt(j) - 'a', hashmap.get(input_string.charAt(j) - 'a') - 1);
                    }
                }
                for (Integer k:hashmap.keySet()) {
                    if (hashmap.get(k) > 0)
                        diff += hashmap.get(k);
                }
                System.out.println(diff);
            }
        }
    }
}
