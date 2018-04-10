package _057_offer_PrintListFromTailToHead;

import java.util.ArrayList;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */
public class Solution {
    /**
     *栈
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack();
        ArrayList<Integer> re = new ArrayList<>();
        while(listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(stack.size()!=0){
            re.add(stack.pop());
        }
        return  re;
    }
    /**
     *递归
     * @param listNode
     * @return
     */
    ArrayList<Integer> re = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead_1(ListNode listNode) {
        if(listNode!=null){
            this.printListFromTailToHead_1(listNode.next);
            re.add(listNode.val);
        }
        return  re;
    }


}
