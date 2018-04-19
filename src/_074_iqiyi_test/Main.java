package _074_iqiyi_test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
//            if (a > b) {
//                int tmp = a;
//                a = b;
//                b = tmp;
//            }
            int cnt = 0;
//            for (int i = 1; i <= b; i++) {
//                if ((Math.sqrt(i) * 10) % 10 == 0) {
//                    cnt++;
//                }
//            }
            for (int i = 1; i <= a; i++) {
                for (int j =1; j <= b; j ++) {
                    if (((Math.sqrt(i) * 10) % 10 == 0 && (Math.sqrt(j) * 10) % 10 == 0)|| (Math.sqrt(i * j) * 10) % 10 == 0) {
                        cnt++;
                    }

                }
            }
            System.out.println(cnt);
        }
    }


}
