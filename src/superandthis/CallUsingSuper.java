package superandthis;

class parent_class{
	int num =80;
	
	parent_class(){
		System.out.println("Ths is Parent class constructor");
	}
}

class child_class extends parent_class{
	int num =100;
	
	child_class(){
		super();
		System.out.println("Ths is child class constructor");
	}
	void method1() {
		System.out.println("My number is  " +super.num);
	}
	
}
public class CallUsingSuper {
	public static void main(String args[]) {
		child_class obj = new child_class();
		obj.method1();
	}
}
