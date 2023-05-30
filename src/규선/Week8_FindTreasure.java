package 규선;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Week8_FindTreasure {
    public static int getDistance(int x1, int y1, int x2, int y2) {
        int distance = Math.abs(x1 - x2) + Math.abs(y1 - y2);
        return distance;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        Treasure[] t = new Treasure[count];
        for (int i = 0; i < count; i++) {
            String str1 = br.readLine();
            StringTokenizer st1 = new StringTokenizer(str1, " ");
            int x = Integer.parseInt(st1.nextToken());
            int y = Integer.parseInt(st1.nextToken());
            int value = Integer.parseInt(st1.nextToken());
            t[i] = new Treasure(x, y, value); // 보물 위치와 가치 나타내는 객체 생성
        }
        Position p = new Position(2, 1);// 은찬이의 위치 나타내는 객체 생성
        int[] distance = new int[count];

        for (int i = 0; i < count; i++) {
            distance[i] = getDistance(p.x, p.y, t[i].xt, t[i].yt);
        }

        int min = distance[0];
        int mi = 0;
        for (int i = 0; i < count; i++) {
            if (min > distance[i]) {
                min = distance[i];
                mi = i;
            } else if (min == distance[i]) {
                if (t[i].value > t[mi].value) {
                    mi = i;
                }
            } // 심화내용 구현
        }

        bw.write(t[mi].xt + " ");
        bw.flush();
        bw.write(t[mi].yt + " ");
        bw.flush();
        bw.write(t[mi].value + " ");
        bw.flush();
        bw.close();
        // System.out.printf("%d %d %d", t[mi].xt, t[mi].yt, t[mi].value);

    }

    // 보물의 위치 좌표와 가치를 나타내는 클래스
    static class Treasure {
        // 필드 변수 선언. 보물의 좌표 x, y와 보물의 가치 value
        int xt, yt, value;

        public Treasure(int xt, int yt, int value) {
            this.xt = xt;
            this.yt = yt;
            this.value = value;
        }
        // 생성자 선언

    }

    // 은찬이의 위치를 나타내는 클래스
    static class Position {
        int x, y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;

        }


    }
}
