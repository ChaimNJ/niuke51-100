package _062_huawei_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] num = new int[n];
            int[] step = new int[n];
            for (int i = 0; i < step.length; i++) {
                step[i]=Integer.MAX_VALUE;
            }
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
            step[0]=0;
            for (int i = 1; i <n; i++) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < i; j++) {
                    if((i-j)<=num[j]&&step[j]+1<min){
                        min = step[j]+1;
                    }
                }
                step[i]=min;
            }
            System.out.println(step[n-1]);

        }
    }
}
