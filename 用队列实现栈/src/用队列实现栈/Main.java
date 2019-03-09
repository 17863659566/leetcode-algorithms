package 用队列实现栈;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		

	}

}

class MyStack {

    ArrayList<Integer> list;
    public MyStack() {
    	list = new ArrayList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        list.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return list.remove(list.size()-1);
    }
    
    /** Get the top element. */
    public int top() {
        return list.get(list.size()-1);
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return list.size() == 0;
    }
}

