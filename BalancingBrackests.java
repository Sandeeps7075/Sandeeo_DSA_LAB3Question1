package Services;

import java.util.*;

public class BalancingBrackests {

	// create method balanced brackets() to check whether the input string is
	// balanced or not
	public boolean balancedbrackets(String input) {

		// create an empty stack
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < input.length(); i++) {
			char character = input.charAt(i);

			// check whether character is '(', '[' or '{'
			if (character == '{' || character == '[' || character == '(') {
				// push character to stack
				stack.push(character);
				continue;
			}
			// if stack is empty, return false
			if (stack.isEmpty()) {
				return false;
			}

			// use switch statement to pop element from stack and if it is '(', '[' or '{',
			// return false
			char popChar;
			switch (character) {
			case ')':
				popChar = stack.pop();
				if (popChar == '{' || popChar == '[')
					return false;
				break;
			case '}':
				popChar = stack.pop();
				if (popChar == '(' || popChar == '[')
					return false;
				break;
			case ']':
				popChar = stack.pop();
				if (popChar == '(' || popChar == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());

	}
}
