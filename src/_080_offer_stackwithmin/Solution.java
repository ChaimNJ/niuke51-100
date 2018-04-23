package _080_offer_stackwithmin;
import java.util.Stack;

public class Solution {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack_1 = new Stack<>();
    int min = Integer.MAX_VALUE;

    public void push(int node) {
        stack.push(node);
        if (node < min) {
            stack_1.push(node);
            min = node;
        } else {
            stack_1.push(min);
        }

    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            stack_1.pop();
            min = stack_1.peek();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min;
    }
}
