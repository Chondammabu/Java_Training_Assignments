package exceptions.ans;

public class ArrayIndexOutOfBound {
	 public static void main(String[] args) {
	        int[] arr = {10,20,40,40};
	      
	        try {
	            System.out.println(arr[5]);
	        }
	        catch (ArrayIndexOutOfBoundsException e){
	            System.err.println("ArrayIndexOutOfBoundsException caught");
	           
	            e.printStackTrace();
	        }
	    }
}
