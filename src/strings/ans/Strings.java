package strings.ans;

public class Strings {
	public static void main(String[] args) {

		// 1. Different ways creating a string
		        String s1 = "This is a string";
		       
		        System.out.println(s1);

		       
		        String s2 = new String("This is fisrt string assignment");
		        System.out.println(s2);


		// 2. Concatenating two strings using + operator
		        String sc1 = "This String is ";
		        String sc2 = "Concatenated";
		        String con = sc1 + sc2; 
		        System.out.println(con);


		// 3. Finding the length of the string
		        String sl = "String Length";
		        int len = sl.length();
		        System.out.println("String Length : " + len);


		// 4. Extract a string using Substring
		        String es = "Extracting string";
		        String sub = es.substring(2, 10);
		        System.out.println("Extracted string : " + sub);


		// 5. Searching in strings using indexOf()
		        String si = "Searching index";
		        int i1 = si.indexOf("index");
		        int i2 = si.indexOf("h", 3);
		        System.out.println("At Index : " + i1);
		        System.out.println("At Index : " + i2);


		// 6. Matching a String Against a Regular Expression With matches()
		        String ms = "Matching a String";
		        boolean match = ms.matches("(.*)String(.*)");
		        System.out.println("Matches : " + match);


		/* 7. Comparing strings using the methods equals(), equalsIgnoreCase(),
		      startsWith(), endsWith() and compareTo()
		 */
		        String cs1 = "Comparing strings";
		        String cs2 = "Comparing strings";

		        //two strings are compared using equals() method
		        boolean e = cs1.equals(cs2);
		        System.out.println("Equal : " + e);

		        //equalsIgnoreCase() method ignores case differences
		        boolean eic = cs1.equalsIgnoreCase(cs2);
		        System.out.println("Equal(ignore case) : " + eic);

		        //startsWith() method checks string begins
		        boolean sw = cs1.startsWith("Comp");
		        System.out.println("Starts with : " + sw);

		        //endsWith() method checks string ending
		        boolean ew = cs1.endsWith("ings");
		        System.out.println("Ends with : " + ew);

		        //compareTo() method returns 0 if both are equal
		        int ct = cs1.compareTo(cs2);
		        System.out.println("Compared : " + ct);


		// 9. Trimming strings with trim()
		        String ts = "   Trimming String  ";
		        String trm = ts.trim();
		        System.out.println("Trimmed : " + trm);


		// 10. Replacing characters in strings with replace()
		        String rs = "Replacing string";
		        String rpl = rs.replace("g", "n");
		        System.out.println("Replaced : " + rpl);


		// 11. Splitting strings with split()
		        String ss = "Splitting String";
		        
		        String[] spl = ss.split(" "); 

		        for (String i : spl) {
		            System.out.println("Splitted : " + i);
		        }


		// 12. Converting Numbers to Strings with valueOf()
		        int ns = 11;
		       
		        String nTs = String.valueOf(ns);
		        System.out.println("Converted Num to Str : " + nTs + 100);


		// 13. Converting integer objects to Strings
		        int is = 11;
		        
		        String iTs = Integer.toString(is);
		        System.out.println("Converted int to str : " + iTs + 100);


		// 14. Converting to uppercase and lowercase
		        String a = "upper case";
		        String b = "LOWER CASE";
		        
		        String c = a.toUpperCase();
		       
		        String d = b.toLowerCase();
		        System.out.println("Converted to upper case : " + c);
		        System.out.println("Converted yo lower case : " + d);
		    }
		
}
