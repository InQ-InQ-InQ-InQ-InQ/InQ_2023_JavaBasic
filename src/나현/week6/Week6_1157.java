package 나현.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Week6_1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        br.close();

        int count = 0;
        char result = 0;
        int[] arr = new int[s.length()]; //반복횟수

        if (s.length() == 1) {
            System.out.println(s);
        } else {
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < i; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        result = s.charAt(i);
                        count++;
                    }
                }
                arr[i] = count;
                count = 0; //초기화
            }

            Arrays.sort(arr);
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[arr.length - 1] == arr[arr.length - 2]) {
                    result = '?';
                }
            }
            System.out.println(result);
        }

    }
}
