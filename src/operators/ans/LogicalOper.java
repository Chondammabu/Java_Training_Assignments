package operators.ans;

public class LogicalOper {
	public static void main(String args[]) {
		int a = 15;
		int b = 10;
		int c =8;
		System.out.println(a > b && a > c);
		System.out.println(a < b && a < c);
		System.out.println(a > b || a > c);
		System.out.println(a < b || a < c);
		System.out.println(!(a>b));
		System.out.println(!(a<b));
	}

}
