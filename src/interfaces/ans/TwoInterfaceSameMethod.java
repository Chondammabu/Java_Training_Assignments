package interfaces.ans;

interface printable_3{
	void print_3();
}
interface printable_4 {
	void print_3();
}
public class TwoInterfaceSameMethod implements printable_3, printable_4 {
	public void print_3() {
		System.out.println("This is same method in both interfaces");
	}
	public static void main(String args[]) {
		TwoInterfaceSameMethod obj = new TwoInterfaceSameMethod();
		obj.print_3();
	}
}
