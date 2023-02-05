package day_31jan;
interface A{
	int cube(int a);
	default int square(int x) {
		return x*x;
	}
	default int add(int a , int b ) {
		return (a+b);
	}
	static int sub(int a , int b ) {
		return (a-b);
	}
	static double div(int a , int b ) {
		return a/b;
	}
}
public class FunInterface implements A {
  public int cube(int a){
	  return a*a*a;
  }
  public static void main(String [] args) {
	  FunInterface a = new FunInterface();
	  System.out.println(a.cube(6));
	  System.out.println(a.add(5, 3));
	  System.out.println(A.sub(10,7));
	  System.out.println(A.div(100,4));
  }

}
