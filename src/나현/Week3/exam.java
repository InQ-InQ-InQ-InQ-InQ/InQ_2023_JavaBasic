package 나현.Week3;

import java.io.*;
import java.util.StringTokenizer;

//버펄로 수 받고, int에 넣고, 비교해서 최댓값 찾음.
public class exam {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = new String[9];
        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < 9; i++) {
            if (max < Integer.parseInt(arr[i])) {
                max = Integer.parseInt(arr[i]);
                index = i;
            }
        }

        index += 1;


        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(index));
        bw.flush();
    }

}
