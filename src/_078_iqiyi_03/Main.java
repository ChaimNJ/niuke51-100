package _078_iqiyi_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n =sc.nextInt();
            int m = sc.nextInt();
            int[][] limit = new int[n][2];
            for (int i = 0; i < n; i++) {
                limit[i][0]=sc.nextInt();
                limit[i][1]=sc.nextInt();
            }
            getResult(n,m,limit);
            System.out.println(sum);
        }
    }
    static int sum = 0;
    private static void getResult(int n, int m, int[][] limit) {
        if(n==1&&m>limit[limit.length-n][1]||n==1&&m<limit[limit.length-n][0]){
            return;
        }else if(n==1&&m>=limit[limit.length-n][0]&&m<=limit[limit.length-n][1]){
            sum+=1;
            return;
        }
        for (int i = limit[limit.length-n][0]; i <=limit[limit.length-n][1] ; i++) {
            getResult(n-1,m-i,limit);
        }

    }
}

