package abstractclass.ans;

abstract class Pig {
	public abstract void animalSound();
	
	public void sleep() {
		System.out.println("ZZZZZ");
	}
}
class Abstractclass extends Pig {
	public void animalSound() {
		System.out.println("weee weeee");
	}
	
	 public static void main(String[] args) {
		 Pig A = new Abstractclass();
		 A.sleep();
		 Abstractclass B = new Abstractclass();
		 B.sleep();
		 B.animalSound();
		 
	 }

}
