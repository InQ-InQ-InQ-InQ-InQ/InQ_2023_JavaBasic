package 성현;

import java.io.*;
public class Week5_2720 {

    public static void main(String []args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
            int a=arr[i]/25;
            arr[i]%=25;
            int b=arr[i]/10;
            arr[i]%=10;
            int c=arr[i]/5;
            arr[i]%=5;
            int d=arr[i]/1;
            bw.write(a+" "+b+" "+c+" "+d+"\n");
        }

        bw.flush();
    }
}