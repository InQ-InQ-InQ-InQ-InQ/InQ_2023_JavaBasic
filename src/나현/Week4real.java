package 나현;

import java.io.*;
import java.util.StringTokenizer;

public class Week4real {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            br.close();
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < n; i++) {

            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }


        bw.write(String.valueOf(min));
        bw.write(" ");
        bw.write(String.valueOf(max));
        bw.flush();

    }
}
