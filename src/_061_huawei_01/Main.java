package _061_huawei_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println((int)'a'+" "+(int)'A'+" "+(int)'0');
//        System.out.println((int)'z'+" "+(int)'Z'+" "+(int)'9');
//        97 65 48
//        122 90 57
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            String[] str = new String[62];
            for (int i = 0; i < str.length; i++) {
                str[i] = "";
            }
            for (int i = 0; i < s.length(); i++) {
                int tmp = (int) s.charAt(i);
                if (tmp >= 65 && tmp <= 90) {
                    str[tmp - 55] += s.charAt(i);
                } else if (tmp >= 97 && tmp <= 122) {
                    str[tmp - 61] += s.charAt(i);
                } else {
                    str[tmp - 48] += s.charAt(i);
                }
            }
            int max = 0;
            for (int i = 0; i < str.length; i++) {
                max = Math.max(str[i].length(), max);
            }

            for (int j = 0; j < max; j++) {
                for (int i = 0; i < str.length; i++) {
                    if (str[i]!= "") {
                        System.out.print(str[i].charAt(0));
                        if(str[i].length()==1){
                            str[i]="";
                        }else {
                            str[i] = str[i].substring(1, str[i].length());
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
