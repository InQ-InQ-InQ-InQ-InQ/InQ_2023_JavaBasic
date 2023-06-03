package 성현;
import java.io.*;


public class Week6_1157 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int []arr=new int[26];
        String str=br.readLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                arr[str.charAt(i)-'A']++;
            }
            else
                arr[str.charAt(i)-'a']++;
        }
        int temp=-1;
        int num=-1;
        for(int i=0;i<26;i++){
            if(arr[i]>temp) {
                temp = arr[i];
                num=i;
            }
            else if(arr[i]==temp){
                num=-1;

            }
        }

        if(num==-1)
            bw.write("?");
        else if(num!=-1)
            bw.write('A'+num);
        bw.flush();
    }
}