package day_31jan;

import java.util.function.*;

interface MyFunctionalInterface {
	   person getPerson(String name);
	}
class person{
	   private String name;
	   public person(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      return name;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	}
public class ConstructorRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyFunctionalInterface a = person::new;

	      Function<String, person> f1 = person::new;    // Constructor Reference
	      Function<String, person> f2 = (name) -> new person(name);

	      System.out.println(a.getPerson("satwik").getName());
	      System.out.println(f1.apply("Jai").getName());
	      System.out.println(f2.apply("sayam").getName());
	}

}
