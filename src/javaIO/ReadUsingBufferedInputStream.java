package javaIO;
import java.io.*;

public class ReadUsingBufferedInputStream {
	public static void main(String args[]) {
		try {
			FileInputStream file = new FileInputStream("sample1.txt");
			BufferedInputStream bs = new BufferedInputStream(file);
			int i;
			while((i = bs.read()) != -1) {
				System.out.print((char) i);
				
			}
			file.close();
			bs.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
