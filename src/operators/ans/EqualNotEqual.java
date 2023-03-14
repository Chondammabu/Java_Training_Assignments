package operators.ans;

import java.util.Scanner;

public class EqualNotEqual {
	public static void main(String args[]) {
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter the First Value");
		int a = obj1.nextInt();
		System.out.println("Enter the Second Value");
		int b = obj1.nextInt();
		if (a ==b) {
			System.out.println("Both numbers are equal");
		}
		else if(a!=b) {
			System.out.println("Both numbers are not equal");
		}
	}

}
