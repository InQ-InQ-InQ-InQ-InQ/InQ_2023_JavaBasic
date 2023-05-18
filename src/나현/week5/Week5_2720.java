package 나현.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week5_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine()); //갯수

        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++) {
            int money = Integer.parseInt(br.readLine());
            sb.append(money / q).append(" ");
            money %= q;

            sb.append(money / d).append(" ");
            money %= d;

            sb.append(money / n).append(" ");
            money %= n;

            sb.append(money / p).append("\n");
            money %= p;
        }
        System.out.println(sb);
        br.close();
    }
}

