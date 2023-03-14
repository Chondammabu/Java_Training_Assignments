package loops.ans;

import java.util.Scanner;

public class EvenOrOdd{
	public static void main(String args[]) {
		int n;
		System.out.println("Enter a number");
		n = new Scanner(System.in).nextInt();
		switch( n% 2) {
		
		case 0 : 
				System.out.println(n + " ia a Even Number");
				break;
		case 1:
			System.out.println(n + " ia a Odd Number");
			break;
				
		}
	}

}
