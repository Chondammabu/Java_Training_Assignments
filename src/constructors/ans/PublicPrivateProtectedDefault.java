package constructors.ans;

public class PublicPrivateProtectedDefault {
	int rollNo;
    String name;
    String clg;
    String city;

    {System.out.println("Student Details");}
    //default access modifier
    PublicPrivateProtectedDefault() {
        this(11);
    }

    //public access modifier
    public PublicPrivateProtectedDefault(int rollNo) {
        this("Chondamma");
        this.rollNo = rollNo;
        System.out.println("rollNo : " + rollNo);
    }

    //private access modifiers
    private PublicPrivateProtectedDefault(String name) {
        this("MIT", "Manipal");
        this.name = name;
        System.out.println("Name : " + name);
    }

    //protected access modifiers
    protected PublicPrivateProtectedDefault(String clg, String city) {
        this.clg = clg;
        this.city = city;
        System.out.println("college : " + clg);
        System.out.println("City : " + city);
    }

    public static void main(String[] args) {
        //calling the constructor multiple times with the same object
        PublicPrivateProtectedDefault c = new PublicPrivateProtectedDefault();
    }

}
