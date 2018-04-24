package _086_offer_getleastknumbers;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        System.out.println(GetLeastNumbers_Solution(new int[]{1,2,3,4,5},3).toString());
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input.length == 0 || k == 0||k>input.length) {
            return list;
        }
        int start = 0;
        int end = input.length - 1;
        int index = Partition(input, start, end);
        while (index != k - 1) {
            if (index > k - 1) {
                end = index - 1;
                index = Partition(input, start, end);
            } else {
                start = index + 1;
                index = Partition(input, start, end);
            }
        }
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    public static int Partition(int[] input, int start, int end) {
        int pivot = input[start];
        while (start < end) {
            while (start < end && input[end] >= pivot) end--;
            input[start] = input[end];
            while (start < end && input[start] <= pivot) start++;
            input[end] = input[start];
        }
        input[start] = pivot;
        return start;
    }
}
