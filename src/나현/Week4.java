package 나현;

import java.util.Scanner;

public class Week4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = in.nextInt(); //5

        for (int k = 1; k < i+1; k++) { //1,2
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


