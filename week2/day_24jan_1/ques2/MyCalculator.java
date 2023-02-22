package Day24jan;

public class MyCalculator implements AdvancedArithmetic{

	@Override
	public int divisor_sum(int n) {
		if(n>1000) {
			return 0;
		}
		int sum=0;
		for(int i =1 ; i<= n ; i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
	MyCalculator c1 = new MyCalculator();
	int a =c1.divisor_sum(6);
	System.out.println(a);
	}
}
