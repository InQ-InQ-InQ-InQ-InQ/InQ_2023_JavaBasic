package 나현.Week3;

import java.io.*;
import java.util.StringTokenizer;

//첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
//둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
public class Week4_10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(s1, " ");
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken()); //기준

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            br.close();
        }

        for (int i = 0; i < n; i++)
            if (m > arr[i])  {
                bw.write(String.valueOf(arr[i]));
                bw.write(" ");
            }

        bw.flush();

    }
}
