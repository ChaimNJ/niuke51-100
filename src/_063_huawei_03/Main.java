package _063_huawei_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(getResult(s1,s2));
        }
    }

    private static String getResult(String s1, String s2) {
        String[] tmp = new String[s2.length()];

        for (int i = s2.length()-1; i >=0 ; i--) {
            int a = s2.charAt(i)-'0';
            StringBuffer sb = new StringBuffer();
            int jinwei = 0;
            for (int j = s1.length()-1; j>=0 ; j--) {
                sb.insert(0,(a*(s1.charAt(j)-'0')+jinwei)%10);
                jinwei = (a*(s1.charAt(j)-'0')+jinwei)/10;
                if(j==0&&jinwei>0){
                    sb.insert(0,jinwei);
                }
            }
            tmp[i] = sb.toString();
        }
        int w = s1.length()+tmp.length-2+tmp[0].length()-s1.length()+1;

        for (int i = tmp.length-1,g=0; i >=0; i--,g++) {
            if(tmp[i].length()<w){
                StringBuffer sf = new StringBuffer(tmp[i]);
                for (int k = 0; k <g ; k++) {
                    sf.append("0");
                }
                for (int j  = 0; j <w-tmp[i].length()-g; j++) {
                    sf.insert(0,"0");
                }
                tmp[i]=sf.toString();
            }
        }

//        for (int l = 0; l < tmp.length; l++) {
//            System.out.println(tmp[l].toString());
//        }
        StringBuffer result = new StringBuffer();
        int jin = 0;
        for (int i = w-1; i >=0; i--) {
            int sum =0;
            for (int j = 0; j < tmp.length; j++) {
                sum+=tmp[j].charAt(i)-'0';
            }
            sum+=jin;
            result.insert(0,sum%10);
            jin=sum/10;
        }
        if(jin>0){
            result.insert(0,jin);
        }
        return result.toString();
    }
}
