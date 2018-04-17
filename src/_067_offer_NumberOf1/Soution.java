package _067_offer_NumberOf1;

/**
 * 计算一个整数的二进制中的1的个数
 */
public class Soution {

    public static void main(String[] args) {
        System.out.println(NumberOf1_2(9));
    }
    /**与1相与
     * @param n
     * @return
     */
    public static int NumberOf1(int n){
        int count = 0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n>>=1;
        }
        return count;
    }

    /**
     * 将n分别和1,2,4，……相与
     * @param n
     * @return
     */
    public static int NumberOf1_1(int n){
        int cnt = 0;
        int f=1;
        if(n<0){
            n=-n;
            cnt++;
        }
        while(f<n){
            if((n&f)==f){
                cnt++;
            }
            f<<=1;
        }
        return cnt;
    }

    /**
     * n和n-1相与，刚好消去n的最右边的1，继续循环
     * @param n
     * @return
     */
     public static int NumberOf1_2(int n){
        int cnt = 0;
        if(n<0){
            n=-n;
            cnt++;
        }
        while(n>0){
            cnt++;
            n=n&(n-1);
        }
        return cnt;
    }



}
