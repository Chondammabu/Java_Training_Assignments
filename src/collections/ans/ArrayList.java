package collections.ans;
import java.util.Arrays;
import java.util.Iterator;
public class ArrayList {
	 public static void main(String[] args) {

	        //passing an Array converted to List using the asList() method
	        java.util.ArrayList<String> arrli = new java.util.ArrayList<>(
	                Arrays.asList("zero", "one", "two", "three", "four", "five"));
	        System.out.println("\narrli = " + arrli);

	        //a. adding elements to the ArrayList using add method using add() method
	        arrli.add("six");
	        arrli.add("seven");
	        arrli.add("eight");
	        arrli.add("nine");
	        System.out.println("\nAfter adding elements :");
	        System.out.println("arrli = " + arrli);


	        //b. Iterating through the ArrayList by using Iterator object
	        Iterator<String> itr = arrli.iterator();
	        System.out.println("\nIterating through the ArrayList : ");
	        while (itr.hasNext()) {
	            System.out.print(itr.next() + " ");
	        }
	        System.out.println(" ");

	        //c. Adding an element at a specific index using add() method
	        arrli.add(1, "AtIndex1");
	        System.out.println("\nAfter adding an element at index 1 :");
	        System.out.println("arrli = " + arrli);

	        //d. Removing an element at a specific index using remove() method
	        arrli.remove(1);
	        System.out.println("\nAfter removing an element at index 1 :");
	        System.out.println("arrli = " + arrli);

	        //e. Updating the element at a specific index using set() method
	        arrli.set(1, "ONE");
	        System.out.println("\nAfter updating the element at index 1 :");
	        System.out.println("arrli = " + arrli);

	        //f. Checking the element is present at a particular index using indexOf() method
	        System.out.println("\nThe element is present at index :");
	        System.out.println(arrli.indexOf("three"));

	        //g. Getting an element at a particular index using get() method
	        System.out.println("\nThe element at index 3 :");
	        System.out.println(arrli.get(3));

	        //h. Finding the size of the ArrayList using size() method
	        System.out.println("\nSize of the ArrayList : ");
	        System.out.println(arrli.size());

	        //i. Checking the element is present in the ArrayList using contains() method
	        System.out.println("\n'two' is present in the ArrayList : ");
	        System.out.println(arrli.contains("two")); //returns boolean value

	        //j. Removing all elements of the ArrayList using clear() method
	        System.out.println("\nAfter removing all elements of the ArrayList :");
	        arrli.clear();
	        System.out.println("arrli = " + arrli);
	    }
}
