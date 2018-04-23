package _081_offer_ispoporder;

import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        boolean flag = false;
        Stack<Integer> stack = new Stack<>();
        if(pushA.length!=0&&popA.length!=0){
            int popcnt = 0;
            int pushcnt = 0;

            while(popcnt< popA.length){
                while(stack.isEmpty()||stack.peek()!=popA[popcnt]){
                    if(pushcnt==pushA.length){
                        break;
                    }
                    stack.push(pushA[pushcnt]);
                    pushcnt++;
                }
                if(stack.peek()!=popA[popcnt]){
                    break;
                }
                stack.pop();
                popcnt++;
            }
            if(stack.isEmpty()&&popcnt==popA.length){
                flag=true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.IsPopOrder(new int[]{1,2,3,4,5},new int[]{4,3,5,1,2}));
    }
}
