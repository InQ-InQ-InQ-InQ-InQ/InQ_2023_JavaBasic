package 재훈;

import java.util.Scanner;

public class Week3_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n - i; j++){
                System.out.print(" ");
            }
            for(int k = n; k >= n - i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
