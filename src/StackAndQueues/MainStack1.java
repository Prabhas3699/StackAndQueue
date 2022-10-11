package StackAndQueues;

public class MainStack1 {

	public static void main(String[] args) {
		
		Stack1 stack = new Stack1();
	    stack.Push(56);
	    stack.Push(30);
	    stack.Push(70);

	    stack.PrintStack();

	    stack.peek();
	    stack.pop();

	    stack.PrintStack();

	}

}
