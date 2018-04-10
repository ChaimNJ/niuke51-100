package _060_offer_MinNumberInRotateArray;

public class Solution {
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        for (int i= 0;i < array.length - 1; i++){
            if (array[i] > array[i + 1]) {
                return array[i + 1];
            }
        }
        return 0;
    }

    /**
     * 二分查找O(logn)
     * @param array
     * @return
     */
    public int minNumberInRotateArray_1(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int l = 0;
        int h = array.length;
        int mid =0;
        while(array[l]>=array[h]){
            if(h-l==1){
                mid = h;
                break;
            }
            mid = (l+h)/2;
            if(array[l]==array[h]&&array[l]==array[mid]){
                return MinInOrder(array,l,h);
            }
            if(array[l]<=array[mid]){
                l=mid;
            }else if(array[mid]<=array[h]){
                h=mid;
            }
        }
        return array[mid];
    }

    private int MinInOrder(int[] array, int l, int h) {
        int re = array[l];
        for (int i = l+1; i <= h; i++) {
            if(array[i]>array[i+1]){
                re =array[i];
                break;
            }
        }
        return re;
    }


}
