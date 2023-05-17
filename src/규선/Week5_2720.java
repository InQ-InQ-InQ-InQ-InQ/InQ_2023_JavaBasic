package 규선;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Week5_2720 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String str1 = br.readLine();
            StringTokenizer st1 = new StringTokenizer(str1, " ");
            int t = Integer.parseInt(st1.nextToken());
            int[] c = new int[t];

            for (int i = 0; i < t; i++) {
                String str = br.readLine();
                StringTokenizer st = new StringTokenizer(str, " ");
                c[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < t; i++) {
                if (c[i] > 500) {
                    System.out.println("잘못된 거스름돈 입니다.");
                } else {
                    int q = 0, d = 0, n = 0, p = 0;
                    q = c[i] / 25;
                    d = (c[i] % 25) / 10;
                    n = ((c[i] % 25) % 10) / 5;
                    p = (((c[i] % 25) % 10) % 5) / 1;
                    System.out.printf("%d %d %d %d\n", q, d, n, p);
                }
            }
        } catch (IOException e) {
            System.out.println("입출력 오류!");
        }
    }
}
