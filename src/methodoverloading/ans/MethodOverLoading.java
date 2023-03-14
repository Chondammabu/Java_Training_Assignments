package methodoverloading.ans;

public class MethodOverLoading {
	int num1;
	int num2;
	int rollno;
	String name;
	
	void method_1(int num1){
		this.num1 = num1;
		System.out.println("First NUmber " +num1);
		
	}
	void method_1(int num1, int num2) {
		this.num1= num1;
		this.num2 = num2;
		System.out.println("Sum of two numbers " + (num1 + num2));
	}
	 void method2(int rollno) {
	        this.rollno = rollno;  
	        System.out.println("2.Roll number : " + rollno);
	 }
	 void method2(int rollno, String name) {
	        this.rollno = rollno;  
	        System.out.println("Roll number : " + rollno + "Name :" +name);
	 }
	 void method4(int rollno) {
	        this.rollno = rollno; 
	        System.out.println("4.Roll number : " + rollno);
	    }
	   
	    void method4(String name) {
	        this.name = name;  
	        System.out.println("4.Name : " + name);
	    }
	    public static void main(String[] args) {

	    	MethodOverLoading mo = new MethodOverLoading();
	       
	        mo.method_1(11);
	        mo.method_1(10, 20);

	        
	        mo.method2(317);
	        mo.method2(317, "Chondamma");

	       
	        mo.method4(317);
	        mo.method4("Chondamma");
	    }
}
