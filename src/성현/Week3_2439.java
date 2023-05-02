package 성현;
import java.util.*;
public class Week3_2439 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int N=s.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<N-i-1;j++)
                System.out.print(" ");
            for(int k=0;k<i+1;k++)
                System.out.print("*");
            System.out.println("");
        }
    }
}