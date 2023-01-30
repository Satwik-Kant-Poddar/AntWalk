package day27;
import java.util.*;
class genric<t>{
	t data;
	genric(){
		
	}
	genric(t a){
		data =a;
	}
	void set(t a) {
		data =a;
	}
	void display() {
		System.out.println(data);
	}
	void print(ArrayList<genric<t>> arr) {
		for(genric each : arr ) {
			each.display();
		}
	}
}

public class Gen {

	public static void main(String[] args) {
		genric<Integer> a = new genric();
		a.set(10);
		a.display();
		genric<String> b = new genric();
		b.set("satwik");
		b.display();
		genric<Double> c = new genric();
		c.set(10.5d);
		c.display();
		genric<Float> d = new genric();
		d.set(18.55f);
		d.display();
		
		ArrayList<genric<Integer>> arr = new ArrayList();
		arr.add(new genric<>(10));
		arr.add(new genric<>(20));
		arr.add(new genric<>(30));
	    a.print(arr);
	    
	    ArrayList<genric<String>> arString = new ArrayList();
		arString.add(new genric<>("satwik"));
		arString.add(new genric<>("sayam"));
		arString.add(new genric<>("vir"));
	    b.print(arString);
		
	}

}
