package collections.ans;
import java.util.Iterator;
public class HashSet {
	 public static void main(String[] args) {

	        java.util.HashSet<String> hashset = new java.util.HashSet<>();

	        //a. adding elements to the HashSet using add() method
	        hashset.add("zero");
	        hashset.add("one");
	        hashset.add("two");
	        hashset.add("three");
	        hashset.add("four");
	        hashset.add("five");
	        hashset.add("six");
	        hashset.add("seven");
	        hashset.add("eight");
	        hashset.add("nine");
	        hashset.add("ten");
	        //does not allow duplicate elements, Set contains unique elements only.
	        hashset.add("nine");
	        System.out.println("\nAfter adding elements to HashSet :");
	        //HashSet doesn't maintain the insertion order
	        System.out.println("hashset = " + hashset);


	        //b. Iterating through the HashSet by using Iterator object
	        Iterator<String> itr = hashset.iterator();
	        System.out.println("\nIterating through the HashSet : ");
	        while (itr.hasNext()) {
	            System.out.print(itr.next() + " ");
	        }
	        System.out.println(" ");

	        //c. Create a clone/copy of HashSet using clone() method
	        System.out.println("\nclone/copy of HashSet : ");
	        System.out.println(hashset.clone());

	        //c. Removing a specific element using remove() method
	        hashset.remove("zero");
	        System.out.println("\nAfter removing element 'zero' :");
	        System.out.println("hashset = " + hashset);

	        //f. Checking if the set is empty using isEmpty() method
	        System.out.println("\nChecking if the set is empty :");
	        System.out.println(hashset.isEmpty());


	        //h. Finding the size of the HashSet using size() method
	        System.out.println("\nSize of the HashSet : ");
	        System.out.println(hashset.size());

	        //d. Checking if element is present in the HashSet using contains() method
	        System.out.println("\nElement 'one' is present in the HashSet : ");
	        System.out.println(hashset.contains("one")); //returns boolean value

	        //j. Removing all elements of the HashSet using clear() method
	        System.out.println("\nAfter removing all elements of the HashSet :");
	        hashset.clear();
	        System.out.println("hashset = " + hashset);
	    }
}
