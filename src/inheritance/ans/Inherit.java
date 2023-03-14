package inheritance.ans;

class A{
	int speedlimit = 90;
	public void methodA1() {
		System.out.println("This is class A method1");
	}
	public void methodA2() {
		System.out.println("This is class A method2");
	}
	public void method1() {
		System.out.println("This is class A-override method");
	}
}

class B extends A{
	int speedlimit = 100;
	public void methodB1() {
		System.out.println("This is class B method1");
	}
	public void methodB2() {
		System.out.println("This is class B method2");
	}
	public void method1() {
		System.out.println("This is class B- Overridden method");
	}
}
class C extends B{
	int speedlimit = 110;
	public void methodC1() {
		System.out.println("This is class C method1");
	}
	public void methodC2() {
		System.out.println("This is class C method2");
	}
	public void method1() {
		System.out.println("This is class C method- overridden method");
	}
}
public class Inherit {
	public static void main(String args[]) {
		A a = new A();
		a.methodA1();
		a.methodA2();
		a.method1();
		
		B b = new B();
		b.methodB1();
		b.methodB2();
		b.method1();
		
		C c = new C();
		c.methodC1();
		c.methodC2();
		c.method1();
		
		A d = new B();
		d.method1();
		A e = new C();
		e.method1();
		
		A f = new A();
		System.out.println(f.speedlimit);
		A g = new B();
		System.out.println(g.speedlimit);
		A h = new C();
		System.out.println(h.speedlimit);
		
	}

}
