package _082_offer_verifysquanceofbst;

public class Solution {
        public boolean VerifySquenceOfBST(int[] sequence) {
            if(sequence.length==0){
                return false;
            }
            return judge(sequence, 0, sequence.length - 1);
        }

        public static boolean judge(int[] se, int start, int end) {
            if (start > end) {
                return true;
            }
            if (start == end) {
                return true;
            }
            int i = start;
            for (; i < end; i++) {
                if (se[i] > se[end]) {
                    break;
                }
            }

            for (int j = i; j < end; j++) {
                if (se[j] < se[end]) {
                    return false;
                }
            }
            return judge(se, start, i - 1) && judge(se, i, end - 1);
        }

    public static void main(String[] args) {
        System.out.println(judge(new int[]{4,6,7,5}, 0, 3));
    }
}
