package javaIO;
import java.io.FileOutputStream;
import java.io.OutputStream;
public class WriteUsingOutputStream {
	public static void main(String args[]) {
		String st = "This is a line of text inside the file.";
		try {
			OutputStream fs1 = new FileOutputStream("sample.txt");
			
			byte[] bs = st.getBytes();
			fs1.write(bs);
			System.out.println("Data is written to the file.");
			fs1.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
