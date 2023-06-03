package 성현;

import java.io.*;
import java.util.*;
public class Week7 {
    static class Treasure{
        int x;
        int y;
        int value;
        public Treasure(int x, int y, int value){
            this.x=x;
            this.y=y;
            this.value=value;
        }
    }
    static class Position{
        int x;
        int y;
        public Position(int x,int y){
            this.x=x;
            this.y=y;
        }

    }
    public static int getDistance(int x1,int y1,int x2, int y2){
        return Math.abs(x1-x2)+Math.abs(y1-y2);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        Position p=new Position(2,1);
        int num=Integer.parseInt(br.readLine());
        Treasure[] t=new Treasure[num];
        for(int i=0;i<num;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            int value=Integer.parseInt(st.nextToken());
            t[i]=new Treasure(x,y,value);
        }
        int lowdis=getDistance(p.x,p.y,t[0].x,t[0].y);
        int lownum=0;
        for(int i=1;i<num;i++){
            int dis=getDistance(p.x,p.y,t[i].x,t[i].y);
            if(lowdis>dis){
                lowdis=dis;
                lownum=i;
            }
            if(lowdis==dis){
                if(t[lownum].value<t[i].value){
                    lowdis=dis;
                    lownum=i;
                }
            }

        }
        bw.write(t[lownum].x +" "+ t[lownum].y +" "+ t[lownum].value);
        bw.flush();

    }

}

