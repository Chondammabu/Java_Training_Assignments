package javaIO;
import java.io.*;
public class ReadUsingFileReader {
	 public static void main(String[] args) {

	        try {
	           
	            FileReader file = new FileReader("sample.txt");

	            int i;
	           
	            while ((i = file.read()) != -1) {
	               
	                System.out.print((char) i);
	            }
	       
	            file.close();

	        } catch (Exception e) {
	           
	            e.printStackTrace();
	        }
	    }
}
