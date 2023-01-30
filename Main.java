package Driver;

import java.util.*;
import Services.BalancingBrackests;

public class Main {

	public static void main(String[] args) {

		BalancingBrackests balancingBrackets = new BalancingBrackests();

		System.out.println("Enter input string to check:");

		// take input string from user
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		// call balancedbrackets method to check whether input string is balanced of not
		Boolean result = balancingBrackets.balancedbrackets(input);
		if (result) {
			System.out.println("Input string " + input + " is balanced.");
		} else
			System.out.println("Input string " + input + " is not balanced.");
	}
}
