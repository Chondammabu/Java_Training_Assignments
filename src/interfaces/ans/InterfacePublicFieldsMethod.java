package interfaces.ans;

interface printable_8 {
	int age = 34;
	public void print_6();
}

class InterfacePublicFieldsMethod implements printable_8{
	
	public void print_6() {
		System.out.println("Hello");
	}
	public static void main(String args[]) {
		 InterfacePublicFieldsMethod obj = new  InterfacePublicFieldsMethod();
		System.out.println(age);
		obj.print_6();
	}
}