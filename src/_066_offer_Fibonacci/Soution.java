package _066_offer_Fibonacci;

public class Soution {
    /**
     * 递归重读计算太多
     * @param n
     * @return
     */
    public static long Fibo_1(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibo_1(n-1)+Fibo_1(n-2);
        }
    }
    //O(n^2)
    public static long Fibo_2(int n){
        long a = 0;
        long b =1;
        long re = 0;
        for (int i = 2; i <=n; i++) {
            re =a+b;
            a=b;
            b=re;
        }
        return re;
    }

    public static void main(String[] args) {
//        long a = System.currentTimeMillis();
//        System.out.println(Fibo_1(50));
//        long b = System.currentTimeMillis();
//        System.out.println(b-a);
        long a1 = System.currentTimeMillis();
        System.out.println( Fibo_2(100));
        long b1 = System.currentTimeMillis();
        System.out.println(b1-a1);

    }

}
