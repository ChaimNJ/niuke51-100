package _073_iqiyi_test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String x1 = sc.next();
             int k1 = sc.nextInt();
            String x2 = sc.next();
            int k2 = sc.nextInt();
            System.out.println(getResult(x1,k1,x2,k2));
        }
    }

    private static String getResult(String x1, int k1, String x2, int k2) {
        StringBuffer sf1 = new StringBuffer();
        StringBuffer sf2 = new StringBuffer();
        for (int i = 0; i < k1; i++) {
            sf1.append(x1);
        }
        for (int i = 0; i < k2; i++) {
            sf2.append(x2);
        }
        if(sf1.length()==sf2.length()){
            for (int i = 0; i < sf1.length(); i++) {
                if(sf1.charAt(i)>sf2.charAt(i)){
                    return "Greater";
                }else if(sf1.charAt(i)<sf2.charAt(i)){
                    return "Less";
                }else{
                    continue;
                }
            }
            return "Equal";
        }else if(sf1.length()>sf2.length()){
            return "Greater";
        }else{
            return "Less";
        }
    }
}
