import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// you can also use imports, for example:
// import java.math.*;
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String string1 = obj.readLine();
        String string2 = obj.readLine();

        HashMap<Character,Integer> characterIntegerHashMap = new HashMap<Character, Integer>();
        for(int i=0;i<string1.length();i++){
            if(characterIntegerHashMap.containsKey(string1.charAt(i))){
                characterIntegerHashMap.put(string1.charAt(i),characterIntegerHashMap.get(string1.charAt(i))+1);
            }
            else {
                characterIntegerHashMap.put(string1.charAt(i),1);
            }
        }
        int temp_count = 0;
        for(int i=0;i<string2.length();i++){
            if(characterIntegerHashMap.containsKey(string2.charAt(i)) && characterIntegerHashMap.get(string2.charAt(i)) >0 ){
                characterIntegerHashMap.put(string2.charAt(i),characterIntegerHashMap.get(string2.charAt(i))-1);

            }
            else{
                temp_count ++;

            }
        }

        for(int a:characterIntegerHashMap.values()){
            temp_count += a;
        }

        System.out.println(temp_count);

    }
}