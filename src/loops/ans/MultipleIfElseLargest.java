package loops.ans;

public class MultipleIfElseLargest {
	public static void main(String args[]) {
		int a=20, b=30,c=40;
		if((a>b) && (a>c)) {
			System.out.println(a+ "is the largest");
		}
		else if((b>a) && (c>a)) {
			System.out.println(b+ "is the largest");
		}
		else {
			System.out.println(c+ "is the largest");
		}
	}

}
