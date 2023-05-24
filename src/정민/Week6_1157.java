package 정민;
import java.io.*;

public class Week06_1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int [] arr = new int[26];
        String str = br.readLine();

        for(int i =0; i < str.length(); i++) {
            char a = str.charAt(i);

            if (a >= 'a' && a <= 'z') {
                a = (char)(a-'a'+'A');
            }

            if (a >= 'A' && a <= 'Z') {
                int index = a - 'A';
                arr[index]++;
            }
        }
        int max = 0;
        char c = '?';

        for(int i =0; i < 26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                c = (char)(i + 'A');
            }
            else if (arr[i] == max) {
                c = '?';
            }
        }
        bw.write(c);
        bw.flush();

    }

}
