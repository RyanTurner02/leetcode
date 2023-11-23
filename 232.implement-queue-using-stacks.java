import java.util.*;

/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start
class MyQueue {
    private Stack<Integer> end;
    private Stack<Integer> start;

    public MyQueue() {
        end = new Stack<>();
        start = new Stack<>();
    }

    public void push(int x) {
        start.push(x);
    }

    public int pop() {
        transferElements(start, end);
        int ret = end.pop();
        transferElements(end, start);

        return ret;
    }

    public int peek() {
        transferElements(start, end);
        int ret = end.peek();
        transferElements(end, start);

        return ret;
    }

    private void transferElements(Stack<Integer> stack1, Stack<Integer> stack2) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    public boolean empty() {
        return end.isEmpty() && start.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end
