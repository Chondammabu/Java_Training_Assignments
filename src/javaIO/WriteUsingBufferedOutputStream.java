package javaIO;
import java.io.*;
public class WriteUsingBufferedOutputStream {
	public static void main(String args[]) {
		String st = "This is a line of text inside the sample1 file.";
		try {
			FileOutputStream file = new FileOutputStream("sample1.txt");
			BufferedOutputStream bs = new BufferedOutputStream(file);
			
			byte[] s = st.getBytes();
			bs.write(s);
			System.out.println("Data is written to the file.");
			file.close();
			bs.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
