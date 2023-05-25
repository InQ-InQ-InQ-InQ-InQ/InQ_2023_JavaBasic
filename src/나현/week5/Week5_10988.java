package 나현.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week5_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int j = 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(0 + i) != s.charAt(s.length() - (i + 1))) {
                j = 0;
                break;
            }
        }
        System.out.print(j);
    }
}
