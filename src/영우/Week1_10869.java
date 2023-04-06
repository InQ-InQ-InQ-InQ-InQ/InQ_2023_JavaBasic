package 영우;

import java.util.*;
public class Week1_10869 {
    void cal(int A, int B) {
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.print(A%B);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Week1_10869 main = new Week1_10869();
        int A = scan.nextInt();
        int B = scan.nextInt();
        main.cal(A,B);
    }
}
