package loops.ans;

import java.util.Scanner;

public class LargestAmongThree {
	public static void main(String args[]) {
		int a,b,c;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter first number");
		a = num.nextInt();
		System.out.println("Enter Second number");
		b = num.nextInt();
		System.out.println("Enter Third number");
		c = num.nextInt();
		if((a>b) && (a>c)) {
			System.out.println("Largest number is : " +a);
		}
		else if((b>a) && (b>c)) {
			System.out.println("Largest number is : " +b);
		}
		else {
			System.out.println("Largest number is : " +c);
		}
			
	}

}
