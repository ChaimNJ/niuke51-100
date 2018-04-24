package _084_offer_permutation;

import java.util.ArrayList;
import java.util.TreeSet;

public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>();
        Permutation(str.toCharArray(), 0, set);
        list.addAll(set);
        return list;
    }

    public static void Permutation(char[] str, int start, TreeSet<String> list) {
        if (str.length == 0 || start < 0||start>=str.length) {
            return;
        }
        if (start == str.length - 1) {
                list.add(String.valueOf(str));
        }
        for (int i = 0; i < str.length; i++) {
            swap(str, start, i);
            Permutation(str, start + 1, list);
            swap(str, start, i);
        }

    }

    public static void swap(char[] str, int i, int j) {
        char tmp = str[i];
        str[i] = str[j];
        str[j] = tmp;
    }


}
