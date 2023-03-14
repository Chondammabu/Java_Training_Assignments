package constructors.ans;


class child_01 extends Student_1{
	String city;
	
	child_01(){
		super();
	}
	child_01(int age){
		super(age);
	}
	child_01(String fname, String lname, String city){
		super(fname,lname);
		this.city = city;
		System.out.println("City     " +city);
	}
}
public class CallSuperFromChild {
	public static void main(String args[]) {
		new child_01();
		new child_01(34);
		new child_01("Chondamma", " B U","Bengaluru");
	}
}
