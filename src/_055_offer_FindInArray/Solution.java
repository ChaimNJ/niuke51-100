package _055_offer_FindInArray;

/**
 * 在一个二维数组中，每一行都按照从
 * 左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请
 * 完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class Solution {
    /**
     * 对m n
     * O(m*n)
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int [][] array) {
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]==target){
                    return true;
                }else if(array[i][j]>target){
                    break;
                }
            }
        }
        return false;
    }
    /**
     * 对m n,对每一行二分查找
     * O(mlogn)
     * @param target
     * @param array
     * @return
     */
    public boolean Find_1(int target, int [][] array) {

        for (int i = 0; i < array.length; i++) {
            int start =0;
            int end = array[i].length-1;
            while(start<=end){
                int mid = (start+end)/2;
                if(array[i][mid]==target){
                    return true;
                }else if(array[i][mid]<target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return false;
    }/**
     * 对m n,从左下角向右上角查找，大于当前元素右移，否则上移
     * O(max(m,n))
     * @param target
     * @param array
     * @return
     */
    public boolean Find_2(int target, int [][] array) {
        int start_x = 0;
        int start_y = array[0].length-1;
        while(start_x<array.length&&start_y>=0){
            if(array[start_x][start_y]==target){
                return true;
            }else if(array[start_x][start_y]>target){
                start_y--;
            }else{
                start_x++;
            }
        }
        return false;
    }
}
