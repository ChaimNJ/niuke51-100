package _052_AvgOfJinZhi;

import java.util.Scanner;

/**
 * 尽管是一个CS专业的学生，小B的数学基础很好并对数值计算有着特别的兴趣，喜欢用计算机程
 * 序来解决数学问题，现在，她正在玩一个数值变换的游戏。她发现计算机中经常用不同的进制表示
 * 一个数，如十进制数123表达为16进制时只包含两位数7、11（B），用八进制表示为三位数1、7
 * 、3，按不同进制表达时，各个位数的和也不同，如上述例子中十六进制和八进制中各位数的和分别
 * 是18和11,。 小B感兴趣的是，一个数A如果按2到A-1进制表达时，各个位数之
 * 和的均值是多少？她希望你能帮她解决这个问题？ 所有的计算均基于十进制进行，结果也用十进制表示为不可约简的分数形式。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();

            int sum = 0;
            for (int i = 2; i < a; i++) {
                String re = getResult(a,i);
                String[] s = re.split(",");
                for (int j = 0; j < s.length; j++) {
                    sum+=Integer.parseInt(s[j]);
                }
            }
            int b = a-2;
            int maxb = b;
            while(maxb!=1){
                for (int i = b; i >=1 ; i--) {
                    if(sum%i==0&&b%i==0){
                        maxb=i;
                        break;
                    }
                }
                sum/=maxb;
                b/=maxb;
            }
            System.out.println(sum+"/"+b);



        }
    }

    /**
     获取a的k进制数
     * @param a
     * @param k
     * @return
     */
    private static String getResult(int a, int k) {
        StringBuffer sf  = new StringBuffer();
        int y = 0;
        while(a>=k){
            y=a%k;
            a=a/k;
            sf.append(y);
            sf.append(",");
        }
        sf.append(a);
        StringBuffer sf1  = new StringBuffer();
        String[] tmp = sf.toString().split(",");
        for (int i=tmp.length-1 ; i >0 ; i--) {
            sf1.append(tmp[i]+",");
        }
        sf1.append(tmp[0]);
        return sf1.toString();
    }
}
