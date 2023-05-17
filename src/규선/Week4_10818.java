package 규선;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Week4_10818 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str1, " ");
        int arrnum = Integer.parseInt(st1.nextToken());
        int[] num = new int[arrnum];

        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");
        int max = -1000000;
        int min = 10000000;

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st2.nextToken());
            if (num[i] > max)
                max = num[i];
            if (num[i] < min)
                min = num[i];
        }

        System.out.printf("%d %d", min, max);

    }
}
