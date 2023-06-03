package 원감;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 거스름돈 change


public class Week5_2720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc -->  0) { // variable--; variable > 0; 를 합쳐놓은 형태
            int money = Integer.parseInt(br.readLine());

            int q = money/25;
            money = money%25;
            int d = money/10;
            money = money%10;
            int n = money/5;
            money = money%5;
            int p = money;

            System.out.println(q+" "+d+" "+n+" "+p);

        }
    }
}
