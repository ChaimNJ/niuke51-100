package _084_offer_permutation;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class EightQueen {
    public static int cnt = 0;

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        getRe(new int[]{0,1,2,3,4,5,6,7},0,set);
        System.out.println(set.size());
    }

    public static void getRe(int[] col, int start,TreeSet<String> set) {
        if (col.length == 0 || start >= col.length) {
            return;
        }
        if (start == col.length - 1) {
            boolean f = false;
            for (int i = 0; i < col.length; i++) {
                for (int j = i + 1; j < col.length; j++) {
                    if (j - i == Math.abs(col[i] - col[j])) {
                        f = true;
                    }
                }
            }
            if (!f) {
                set.add(Arrays.toString(col));
            }
        }
        for (int i = 0; i < col.length; i++) {
            swap(col, start, i);
            getRe(col, start + 1,set);
            swap(col, start, i);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }


}
