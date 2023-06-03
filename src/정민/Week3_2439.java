package 정민;
import java.util.Scanner;

public class Week03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j<= N - i;j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}