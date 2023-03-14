package collections.ans;

public class HashMap {
	public static void main(String[] args) {
       
        java.util.HashMap<Integer, String> hashmp = new java.util.HashMap<>();

       
        hashmp.put(1, "Chondamma");
        hashmp.put(2, "Kaveramma");
        hashmp.put(3, "Dechammma");
        hashmp.put(4, "Vanitha");
        hashmp.put(5, "Lohith");
        hashmp.put(6, "Mani");
        hashmp.put(7, "Bojamma");
        hashmp.put(8, "Chethan");
        hashmp.put(9, "Grantha");
        hashmp.put(10, "Manju");
        System.out.println("\nkey-value pairs of the Student ID and Name : ");
        System.out.println("hashmp = " + hashmp);

        //b. Fetching the value of a Key using get() method
        System.out.println("\nName of the Student with ID no = 6 :");
        System.out.println(hashmp.get(6));

        //c. Creating a clone/copy of HashMap using clone() method
        System.out.println("\nclone/copy of HashMap hashmp : ");
        System.out.println(hashmp.clone());

        //d. Checking if the given Key is in the Map using containsKey() method
        System.out.println("\nID No = 3 is in the Map : ");
        System.out.println(hashmp.containsKey(3));

        //e. Checking if the value is in the Map using containsValue() method
        System.out.println("\nStudent Name = 'Chondamma' is in the map :");
        System.out.println(hashmp.containsValue("Chondamma"));

        //f. Checking if the map is empty using isEmpty() method
        System.out.println("\nChecking if the map is empty :");
        System.out.println(hashmp.isEmpty());

        //g. Printing the size of the Map to the console using size() method
        System.out.println("\nThe size of the Map is :");
        System.out.println(hashmp.size());

        //h. Printing all the Keys of the map to the console using keySet() method
        System.out.println("\nAll ID No of the students :");
        System.out.println(hashmp.keySet());

        //j. Removing a specific Key-value pair using remove() method
        System.out.println("\nRemoved ID no = 3 ,Student name = 'Dechamma' : ");
        hashmp.remove(3, "Dechamma");
        System.out.println(hashmp);

        //k. Copying all the elements of the Map to another Map using puttAll() method
        System.out.println("\nCopied all the elements of the hashmp to newhash :");

        java.util.HashMap<Integer, String> newhash = new java.util.HashMap<>();

        newhash.putAll(hashmp);
        System.out.println("icfai = " + newhash);
    }
}
