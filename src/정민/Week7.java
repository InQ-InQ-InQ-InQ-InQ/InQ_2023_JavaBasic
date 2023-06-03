package 정민;
import java.io.*;
import java.util.StringTokenizer;

public class Week7 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Treasure [] t = new Treasure[n];   //보물 배열 생성
        for(int i = 0; i <n; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            t[i] = new Treasure(x,y,value);

        }
        Position p = new Position(2,1);

        int[] d = new int[n];  //보물과의 거리 배열 생성

        for(int i = 0; i <n; i++) {
            d[i] = getDistance(p.x,p.y,t[i].x,t[i].y);
        }

        //최소 거리 구하고 보물 인덱스 찾기
        int min = 4;
        int index = -10000;

        for(int i = 0; i < n; i++) {
            if(d[i] < min && d[i] <= 3) {
                min = d[i];
                index = i;

            }
        }

        bw.write(t[index].x+" "+t[index].y+" "+t[index].value);
        bw.flush();

    }

    static class Treasure {
        protected int x;
        protected int y;
        protected int value;

        public Treasure(int x, int y,int value) {
            this.x=x;
            this.y=y;
            this.value=value;
        }


    }

    static class Position {
        protected int x;
        protected int y;

        public Position(int x, int y) {
            this.x=x;
            this.y=y;
        }

    }


    public static int getDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1-x2) + Math.abs(y1-y2);

    }
}