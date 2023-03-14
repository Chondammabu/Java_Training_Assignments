package exceptions.ans;

public class ArithmeticExceptionTryCatch {

    public static void main(String[] args) {
        int a = 20, b = 0, c;
        try {
            System.out.println("Inside try block");
          
            c = a / b;
            System.out.println("c = " + c);
        }
       
        catch (ArithmeticException e) {
            System.out.println("Handling the Arithmetic exception using try-catch block");
        }

    }

}
