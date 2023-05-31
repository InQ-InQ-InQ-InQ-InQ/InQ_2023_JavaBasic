package 원감;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Week7_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Position position = new Position(2, 1);
        ArrayList <Treasure> list = new ArrayList<>(); // 보물 배열 생성
        ArrayList <Integer> distance = new ArrayList<>(); // 보물과의 거리 배열 생성


        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            list.add(new Treasure(x, y, value)); // 보물배열
            distance.add(getDistance(position.x, position.y, list.get(i).x, list.get(i).y));
        }
        // System.out.println(list.get(2).y);
        // System.out.println(distance.get(2));

        int s_distance = 10000;
        int s_index = 10000;

        for (int i = 0; i < N; i++) {  // 최소 거리 구하기
            if(distance.get(i) < s_distance) { // [1, 3, 1] < s_distance
                s_distance = distance.get(i);
                s_index = i;
            }
        }
        bw.write(list.get(s_index).x + " " + list.get(s_index).y + " " +list.get(s_index).value);
        bw.flush();

    }
    public static int getDistance(int x1, int y1, int x2, int y2) {
        // 햔재 은찬이의 위치로부터 보물까지의 거리를 반환. 은찬이의 좌표는 (x1, y1), 목표 보물의 좌표는 (x2, y2)
        return Math.abs(x1-x2) + Math.abs(y1-y2);
    }


    // 보물의 위치 좌표와 가치를 나타내는 클래스
    static class Treasure{
        // 필드 변수 선언. 보물의 좌표 x, y와 보물의 가치 value
        // 생성자 선언
        public int x , y , value;
        public Treasure(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }
    static class Position{
        // 필드 변수 선언 , 좌표 x, y
        public int x; int y;
        // 생성자 선언
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }



}
