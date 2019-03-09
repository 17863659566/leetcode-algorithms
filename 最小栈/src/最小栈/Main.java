package 最小栈;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

	}

}

class MinStack {

    List<Integer> stack;
    public MinStack() {
        stack  = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        stack.add(x);
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
		return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
    	Iterator<Integer> iterator = stack.iterator();
    	int min = stack.get(0);
    	while(iterator.hasNext()) {
    		Integer integer = iterator.next();
    		if(min > integer)
    			min = integer;
    	}
		return min;
        
    }
}
