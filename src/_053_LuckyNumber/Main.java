package _053_LuckyNumber;


import java.util.Scanner;

/**
 * 小明同学学习了不同的进制之后，拿起了一些数字做起了游戏。小明同学知
 * 道，在日常生活中我们最常用的是十进制数，而在计算机中，二进制数也很常用。现在对于一
 * 个数字x，小明同学定义出了两个函数f(x)和g(x)。 f(x)表示把x这个数用十进制写出后
 * 各个数位上的数字之和。如f(123)=1+2+3=6。 g(x)表示把x这个数用二进制写出后
 * 各个数位上的数字之和。如123的二进制表示为1111011，那么，g(123)=1+1+1+1+0+1
 * +1=6。 小明同学发现对于一些正整数x满足f(x)=g(x)，他把这种数称为幸运数，现在他想知道，小于等于n的幸运数有多少个？
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int cnt = 0;
            for (int k = 1; k <= n; k++) {
                String n_s = String.valueOf(k);
                int cnt_10 = 0;
                for (int i = 0; i < n_s.length(); i++) {
                    cnt_10 += Integer.parseInt(String.valueOf(n_s.charAt(i)));
                }
                String n_2_s = getResult(k, 2);
                int cnt_2 = 0;
                for (int i = 0; i < n_2_s.length(); i++) {
                    cnt_2 += n_2_s.charAt(i) - '0';
                }
                if(cnt_2==cnt_10){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

    /**
     * 获取a的2进制数
     *
     * @param a
     * @param k
     * @return
     */
    private static String getResult(int a, int k) {
        StringBuffer sf = new StringBuffer();
        int y = 0;
        while (a >= k) {
            y = a % k;
            a = a / k;
            sf.append(y);
        }
        sf.append(a);
        return sf.reverse().toString();
    }
}
