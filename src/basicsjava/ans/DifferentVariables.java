package basicsjava.ans;

public class DifferentVariables {
	int a= 15;
	void localmethod() {
		int a = 20;
		System.out.println("Local Variable a = " +a);
	}
	public static void main(String args[]) {
		DifferentVariables obj = new DifferentVariables();
		obj.localmethod();
		System.out.println("Instance variable a = " + obj.a);
	}

}
