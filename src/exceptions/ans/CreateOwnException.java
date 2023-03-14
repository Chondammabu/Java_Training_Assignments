package exceptions.ans;

class InvalidExamException extends Exception {
    InvalidExamException(String msg) {
        System.out.println(msg);
    }
}
public class CreateOwnException {
	 static void exam(int marks) throws InvalidExamException {
	        
	        if (marks < 40) {
	            
	            throw new InvalidExamException("Failed in exam");
	        } else {
	            System.out.println("Passed in exam");
	        }
	    }

public static void main(String[] args) {
    try {
        
        exam(39);
    } catch (Exception i) {
        /* printStackTrace() prints the throwable Exception object as well as with other Information
        like the line number where Exception occurs and class name where the exception occurred.*/
        i.printStackTrace();
    }
}
}