package 성현;

import java.io.*;
import java.util.StringTokenizer;

public class Week4_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int a=Integer.parseInt(br.readLine());
        int[] arr=new int[a];
        String str= br.readLine();
        StringTokenizer st=new StringTokenizer(str," ");
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int tmp=arr[0];
        int tmp2=arr[0];
        for(int i=1;i<a;i++){
            if(tmp2>arr[i]){
                tmp2=arr[i];
            }
        }
        for(int i=1;i<a;i++){
            if(tmp<arr[i]){
                tmp=arr[i];
            }
        }
        bw.write(String.valueOf(tmp2)+" ");
        bw.write(String.valueOf(tmp));
        bw.flush();
    }
}
