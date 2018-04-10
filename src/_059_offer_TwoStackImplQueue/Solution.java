package _059_offer_TwoStackImplQueue;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    //将stack2的元素push回来，在push保持顺序
    public void push(int node) {
        while(stack2.size()>0){
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    //pop先将stack1的元素push进来，在pop
    public int pop() {
        while(stack1.size()>0){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
/**
 * 同理两个队列实现栈，先全部进入Q1，遇见pop，Q1全部进入Q2，剩下一个元素，pop
 *
 * push时，Q2不为空的话，Q2全部进入Q1再push
 */
