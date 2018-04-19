package _077_iqiyi_02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[] aa = new int[3];
             aa[0] = sc.nextInt();
             aa[1] = sc.nextInt();
             aa[2] = sc.nextInt();
            Arrays.sort(aa);
            int d1 = aa[2]-aa[1];
            int d2 = aa[2]-aa[0];
            int cnt = 0;
            while(d1>=2){
                d1-=2;
                cnt++;
            }
            while(d2>=2){
                d2-=2;
                cnt++;
            }
            if(d1==1&&d2==1){
                cnt++;
            }else if(d1==0&&d2==1||d1==1&&d2==0) {
                cnt+=2;
            }
            System.out.println(cnt);
        }
    }
}

