package javaIO;
import java.io.FileInputStream;
import java.io.InputStream;
public class ReadUsingInputStream {
	public static void main(String args[]) {
		try {
			InputStream fs = new FileInputStream("sample.txt");
			int i;
			while((i = fs.read()) != -1) {
				System.out.print((char) i);
				
			}
			fs.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
