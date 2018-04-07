package _054_AddCollections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            TreeSet<Integer> set_a = new TreeSet();
            TreeSet<Integer> set_b = new TreeSet();
            for (int i = 0; i < a; i++) {
                set_a.add(sc.nextInt());
            }
            for (int i = 0; i < b; i++) {
                set_b.add(sc.nextInt());
            }
            set_a.addAll(set_b);

            StringBuffer re = new StringBuffer();
            for (int i: set_a) {
                re.append(i+" ");
            }
            System.out.println(re.toString().trim());
        }
    }

}
