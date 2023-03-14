package interfaces.ans;

interface printable {
	void print();
}
class InterfaceOneMethod implements printable {
	public void print(){
		System.out.println("Hello");
		}
	public static void main(String args[]) {
		InterfaceOneMethod obj = new InterfaceOneMethod();
		obj.print();
	}
}
