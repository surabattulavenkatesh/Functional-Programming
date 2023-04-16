package Functional_Interfaces;

import java.util.Arrays;
import java.util.Stack;

public class StringRevInStack {

	public static void main(String[] args) {

		String str = "Hello";
		char[] ch = str.toCharArray();
		Stack<Character> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(char i : ch) {
			
			st.push(i);
		}
		while(!st.isEmpty()) {
			sb.append(st.peek());
			st.pop();
		}
		System.out.println(sb.toString());
	}

}
