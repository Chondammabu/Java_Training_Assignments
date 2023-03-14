package interfaces.ans;

interface pintablel{
	void printOne();
	void printTwo();
}
class InterfaceTwoMethod implements pintablel{
	
	public void printOne() {
		System.out.println("Hello");
	}
	public void printTwo() {
		System.out.println("World");
	}
	
	public static void main(String args[]) {
		InterfaceTwoMethod obj = new InterfaceTwoMethod();
		obj.printOne();
		obj.printTwo();
	}
}
