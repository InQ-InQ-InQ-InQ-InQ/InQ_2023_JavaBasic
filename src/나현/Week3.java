package 나현;

import java.util.Scanner;

//i 입력받고 / i길이만큼 for1 k하나씩 증가 돌림/ 안에 for2문 j하나씩 증가, i-j만큼 공백, j만큼 별찍기
public class Week4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = in.nextInt(); //5

        for (int k = 1; k < i; k++) { //1,2
            for (int l = 1; l <= i - k; l++) {//4번,3
                System.out.print(" ");
            }

            for (int j = 1; j <= k; j++) {//1,2
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}


