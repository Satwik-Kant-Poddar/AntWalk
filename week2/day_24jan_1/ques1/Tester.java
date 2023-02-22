package Day24jan;

public class Tester {
	public static void main(String[] args) {
		A b1= new A();
	    b1.balance=100;
		int a =b1.getbalance();	
		B b2 = new B();
		b2.balance=150;
		int b =b2.getbalance();
		C b3 = new C ();
		b3.balance=200;
		int c = b3.getbalance();
		System.out.println(a+" "+b+" "+c);
	}

}
