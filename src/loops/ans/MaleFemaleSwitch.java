package loops.ans;
import java.util.Scanner;
public class MaleFemaleSwitch {
	public static void main(String args[]) {
		System.out.println("Enter the character(M/F)");
		Scanner obj1 = new Scanner(System.in);
		char ch = obj1.next().charAt(0);
		switch(ch) {
		case 'M':
            System.out.println("Gender is Male");
            break;
        case 'F':
            System.out.println("Gender is Female");
            break;
		}
		obj1.close();
		
	}

}
