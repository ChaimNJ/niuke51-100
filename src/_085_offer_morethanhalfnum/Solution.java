package _085_offer_morethanhalfnum;

public class Solution {

    public static boolean check(int[] arr,int re){
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            if(re==arr[i]){
                cnt++;
            }
        }
        if(cnt*2>arr.length) {
            return true;
        }else{
            return false;
        }
    }

    public static int MoreThanHalfNum_Solution(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        int re = array[0];
        int cnt = 1;
        for (int i = 1; i < array.length; i++) {
            if (cnt == 0) {
                re = array[i];
                cnt = 1;
            } else if (array[i] == re) {
                cnt++;
            } else {
                cnt--;
            }
        }
        if(check(array,re)) {
            return re;
        }else {
            return 0;
        }

    }
}
