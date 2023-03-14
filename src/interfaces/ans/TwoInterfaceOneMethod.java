package interfaces.ans;

interface printable_1{
	void print_1();
}
interface printable_2{
	void print_2();
}
public class TwoInterfaceOneMethod implements printable_1,printable_2 {
	public void print_1() {
		System.out.println("Hello");
	}
	public void print_2() {
		System.out.println("World");
	}
	
	public static void main(String args[]) {
		TwoInterfaceOneMethod obj1 = new TwoInterfaceOneMethod();
		obj1.print_1();
		obj1.print_2();
	}

}
