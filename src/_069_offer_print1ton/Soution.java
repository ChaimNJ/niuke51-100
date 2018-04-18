package _069_offer_print1ton;


public class Soution {
    public static void main(String[] args) {
        print1ton(3);
    }

    public static void print1ton(int n) {
        if (n <= 0) {
            return;
        }
        char[] ch = new char[n];
        for (int i = 0; i <ch.length; i++) {
            ch[i]='0';
        }
        while (Increment(ch)) {
            print(ch);
        }
    }

    private static void print(char[] ch) {
        int f=0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]!='0'||f==1){
                System.out.print(ch[i]);
                f=1;
            }
        }
        System.out.println();
    }

    private static boolean Increment(char[] ch) {
        int j = 1;
        for (int i = ch.length - 1; i >= 0&&j!=0; i--) {
            int num = ch[i]-'0';
            if(i==ch.length-1||j==1){
                if (num + j >= 10) {
                    j = 1;
                    ch[i] = (char) (num + j - 10 + '0');
                } else {
                    ch[i] = (char) (ch[i] + j);
                    j=0;
                }
            }
            if(i==0&&j==1){
                return false;
            }
        }
        return true;
    }
}
