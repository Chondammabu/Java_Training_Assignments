package operators.ans;

public class IncreDecreOperators {
	static void preincrement(int a, int b) {
		int c;
		c = ++a + b;
		System.out.println("Values of a, b and c after preincrement :" +a+ "," +b+ "," +c);
	}
	static void postincrement(int a, int b) {
		int c;
		c = a++ + b;
		System.out.println("Values of a, b and c after postincrement :" +a+ "," +b+ "," +c);
	}
	static void predecrement(int a, int b) {
		int c;
		c = --a + b;
		System.out.println("Values of a, b and c after predecrement :" +a+ "," +b+ "," +c);
	}
	static void postdecrement(int a, int b) {
		int c;
		c = a-- + b;
		System.out.println("Values of a, b and c after postdecrement :" +a+ "," +b+ "," +c);
	}
	public static void main(String args[]) {
		int a =4, b=5;
		preincrement(a,b);
		postincrement(a,b);
		predecrement(a,b);
		postdecrement(a,b);
		
	}

}
