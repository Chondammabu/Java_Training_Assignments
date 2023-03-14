package javaIO;
import java.io.*;
public class WriteUsingBufferedWriter {
	 public static void main(String[] args) {

	        String s = "This text is written using BufferedWriter.";

	        try {
	           
	            FileWriter fw = new FileWriter("sample3.txt");
	           
	            BufferedWriter bw = new BufferedWriter(fw);

	        
	            bw.write(s);
	           
	            bw.close();
	            fw.close();
	            System.out.println("Data is written to the file.");

	        } catch (Exception e) {
	           
	            e.printStackTrace();
	        }
	    }
}
