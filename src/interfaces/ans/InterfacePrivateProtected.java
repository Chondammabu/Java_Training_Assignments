package interfaces.ans;

interface printable_10{
	public int num = 100;
	final int num1 =200;
	static int num3 = 300;
}
class InterfacePrivateProtected implements printable_10 {
	 public static void main(String[] args) {
	        InterfacePrivateProtected obj = new InterfacePrivateProtected();
	        System.out.println(obj.num);
	        System.out.println(obj.num1);
	        System.out.println(obj.num3);
	      
	    }

}
