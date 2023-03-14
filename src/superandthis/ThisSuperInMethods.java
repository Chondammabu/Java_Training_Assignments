package superandthis;

class parent1_class{
	void method1() {
		System.out.println("Ths is parent class method");
	}
	void method2() {
		this.method1();
	}
	
}

class child1_class extends parent1_class{
	
	void method3() {
		super.method2();
}
}
public class ThisSuperInMethods {
	public static void main(String args[]) {
		child1_class obj = new child1_class();
		obj.method3();
	}
}
