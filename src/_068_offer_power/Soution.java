package _068_offer_power;

public class Soution {
    public static void main(String[] args) {
        System.out.println(power(-5.0,-1));
    }
    public static double power(double base,int exp){
        if(equal(base,0.0)&&exp<0){
            return 0.0;
        }
        double re = cal(base, Math.abs(exp));
        if(exp<0){
            re = 1.0/re;
        }
        return re;
    }

    private static double cal(double base, int exp) {
        if(exp==0){
            return 1;
        }else if(exp==1){
            return base;
        }else{
            double re = cal(base,exp/2);
            re*=re;
            if((exp&1)==1){
                re*=base;
            }
            return re;
        }
    }

    public static boolean  equal(double a,double b){
        if(a-b>-0.0000001&&a-b<0.0000001){
            return true;
        }else{
            return false;
        }
    }
}
