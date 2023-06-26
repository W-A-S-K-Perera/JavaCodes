package Stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk = new Stack<>();
		boolean result = stk.empty();
		System.out.println("before enetering values :"+result);
		stk.push(15);
		stk.push(10);
		stk.push(20);
		stk.push(50);
		//top element
		System.out.println("top element :"+stk.peek());
		System.out.println(stk);
		stk.pop();
		System.out.println("top element :"+stk.peek());
		System.out.println(stk);

	}

}
