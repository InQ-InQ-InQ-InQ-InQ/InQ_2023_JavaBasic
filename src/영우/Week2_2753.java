package 영우;

import java.util.*;

public class Week2_2753 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int years = scan.nextInt();
        if ((years % 4 == 0 && years % 100 != 0) || years % 400 == 0) {
            System.out.print("1");
        }
        else {
            System.out.print("0");
        }
    }
}
