package _076_iqiyi_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            String re = "";
            for (int i = 0; i < s.length(); i++) {
                StringBuffer sf = new StringBuffer();
                char pre = 'a';
                for (int j = i; j < s.l ength(); j++) {
                    if (s.charAt(j) > pre) {
                        if (sf.length()!=0) {
                            sf.delete(sf.length() - 1, sf.length());
                        }
                        sf.append(s.charAt(j));
                        pre = s.charAt(j);
                    } else {
                        sf.append(s.charAt(j));
                        pre = s.charAt(j);
                    }
                }
//                fdsfdsfssfsd


                int k = 0;
                if (re == "") {
                    re = sf.toString();
                } else {
                    while (k < Math.min(re.length(), sf.length())) {
                        if (re.charAt(k) == sf.charAt(k)) {
                            k++;
                        } else if (re.charAt(k) < sf.charAt(k)) {
                            re = sf.toString();
                        } else {
                            break;
                        }
                    }
                }

            }
            System.out.println(re);
        }
    }

}

