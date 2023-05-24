package 영우;

import java.io.*;

public class Week5_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        int [] changes = new int[t];

        for(int i = 0; i < t; i++){
            changes[i] = Integer.parseInt(br.readLine());

            int quarter = changes[i] / 25;
            changes[i] %= 25;

            int dime = changes[i] / 10;
            changes[i] %= 10;

            int nickel = changes[i] / 5;
            changes[i] %= 5;

            int penny = changes[i];

            bw.write(quarter + " " + dime +" " + nickel + " " + penny + "\n");
        }

        bw.flush();
    }
}
