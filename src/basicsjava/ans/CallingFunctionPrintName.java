package basicsjava.ans;

public class CallingFunctionPrintName {
	static void mymethod() {
		System.out.println("My name is Chondamma");
	}
	public void mymethod1() {
		System.out.println("My name is Saritha");
	}
	public static void main(String args[]) {
		CallingFunctionPrintName obj = new CallingFunctionPrintName();
		obj.mymethod1();
		mymethod();
	}
}
