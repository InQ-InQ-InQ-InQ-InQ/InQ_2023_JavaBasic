package 영우;

import java.io.*;
import java.util.StringTokenizer;

public class Week4_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];

        String num = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(num);


        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int max = list[0];
        int min = list[0];

        for (int i : list) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }

        bw.write(min + " " + max);
        bw.flush();
    }
}
