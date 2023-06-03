package 영우;

import java.io.*;
import java.util.StringTokenizer;

public class Week7_treasure {
    public static void main(String[] args) throws IOException {
        // 메인 메소드 코드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Position eunchan = new Position(2,1);
        int numberOfTreasure = Integer.parseInt(br.readLine());
        Treasure[] treasureList = new Treasure[numberOfTreasure];


        for (int i = 0; i < numberOfTreasure; i++) {
            String treasureInfo = br.readLine();
            StringTokenizer tokenizer = new StringTokenizer(treasureInfo, " ");

            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            int value = Integer.parseInt(tokenizer.nextToken());

            treasureList[i] = new Treasure(x, y, value);
        }

        int treasureIndex = 0;
        int minDistance = getDistance(eunchan.x, eunchan.y, treasureList[0].x, treasureList[0].y);
        for (int i = 1; i < numberOfTreasure; i++) {
            int distance = getDistance(eunchan.x, eunchan.y, treasureList[i].x, treasureList[i].y);

            if (minDistance > distance) {
                minDistance = distance;
                treasureIndex = i;
            }
        }

        bw.write(treasureList[treasureIndex].x + " " + treasureList[treasureIndex].y + " " + treasureList[treasureIndex].value);
        bw.flush();
    }

    // 보물의 위치 좌표와 가치를 나타내는 클래스
    static class Treasure {
        // 필드 변수 선언. 보물의 좌표 x, y와 보물의 가치 value
        int x;
        int y;
        int value;

        // 생성자 선언
        public Treasure(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }

    // 은찬이의 위치를 나타내는 클래스
    static class Position {
        // 필드 변수 선언. 좌표 x, y
        int x;
        int y;
        // 생성자 선언
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int getDistance(int x1, int y1, int x2, int y2) {
        // 햔재 은찬이의 위치로부터 보물까지의 거리를 반환. 은찬이의 좌표는 (x1, y1), 목표 보물의 좌표는 (x2, y2)
        int distance = Math.abs(x1 - x2) + Math.abs(y1 - y2);
        return distance;
    }
}

