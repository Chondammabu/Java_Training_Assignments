package javaIO;
import java.io.*;
public class ReadUsingBufferedReader {
	public static void main(String args[]) {

        try {
           
            FileReader fr = new FileReader("sample3.txt");
           
            BufferedReader br = new BufferedReader(fr);

            int i;
           
            while ((i = br.read()) != -1) {
               
                System.out.print((char) i);
            }
          
            br.close();
            fr.close();
        } catch (Exception e) {
           
            e.printStackTrace();
        }
    }
}
