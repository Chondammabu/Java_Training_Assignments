package constructors.ans;

class Student_1 {
	int age;
	String fname;
	String lname;
	
	Student_1(){
		System.out.println("Student Details");
	}
	
	Student_1(int age){
		this.age = age;
		System.out.println("Age = " +age);
	}
	Student_1(String fname, String lname){
		this.fname = fname;
		this.lname = lname;
		System.out.println(" Name is   " +fname+ " " +lname);
	}
}
public class DefaultOneTwoArgument {
	public static void main(String args[]) {
	 new Student_1();
	 new Student_1(34);
	new Student_1("Chondamma","BU");
}
}
