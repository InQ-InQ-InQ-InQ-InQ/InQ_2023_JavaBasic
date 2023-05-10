package 영우;

import java.util.*;

public class Week3_2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
