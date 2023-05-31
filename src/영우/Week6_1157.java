package 영우;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Week6_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        HashMap<Character,Integer> hashMap = new HashMap<>();

        String down = str.toLowerCase();

        for (int i = 0; i < down.length(); i++) {
            if (hashMap.containsKey(down.charAt(i))) {
                hashMap.replace(down.charAt(i),hashMap.get(down.charAt(i))+1);
            }
            else hashMap.put(down.charAt(i), 1);
        }

        int max = 0;
        char maxChar = ' ';

        for(Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            char key = entry.getKey();
            Integer value = entry.getValue();

            if(max == value) {
                maxChar = '?';
            } else if(max < value) {
                max = value;
                maxChar = key;
            }
        }


        bw.write(String.valueOf(maxChar).toUpperCase());
        bw.flush();
    }
}
