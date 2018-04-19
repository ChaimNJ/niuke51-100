package _075_iqiyi_test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0, max = 0, i;
        for (i=0; i<s.length(); ++i) {
            if (s.charAt(i) == '(')
                cnt++;
            else
                cnt--;
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String s = sc.next();
//            int i = 0;
//            System.out.println(getdeep(s,i,s.length()));
//        }
//    }

    private static int getdeep(String s,int i,int j) {
        if(s.substring(i,j).equals("")){
            return 0;
        }else if(s.substring(i,j).equals("()")){
            return 1;
        }else{
            if(s.charAt(i+1)=='('){
                return getdeep(s,i+1,tail(s,i+1))+1;
            }else{
                int max = 1;
                for (int k = i; k < s.length(); k=tail(s,k)) {
                    max =Math.max(max,getdeep(s,k,tail(s,k)));
                }
                return max;
            }
        }

    }
    private static int tail(String s,int i){
        int cnt=1;
        int next = i+1;
        while(cnt!=0&&next<s.length()){
            if(s.charAt(next)=='('){
                cnt++;
            }else{
                cnt--;
            }
            next++;
        }
        return next;
    }

}

