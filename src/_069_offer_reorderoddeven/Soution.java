package _069_offer_reorderoddeven;

import java.util.Arrays;

public class Soution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reorder(new int[]{1,2,3,4,5,6,7,8,9})));
    }
    public static int[] reorder(int[] a){
        int start = 0;
        int end = a.length-1;
        while(start<end){
            while(a[start]%2==1) start++;
            while(a[end]%2==0) end--;
            if(start<end){
                int tmp = a[start];
                a[start] = a[end];
                a[end] = tmp;
            }
        }
        return a;
    }

}
