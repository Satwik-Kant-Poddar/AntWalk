package day30jan;
import java.util.*;
import java.util.stream.Collectors;
class Employee{
	double setsalary(double a) {
		 this.salary=a;
		 return this.salary;
	}
	double getsalary() {
		return this.salary;
	}
	double changeSal(double a) {
		return (a*1.1);
	}
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void diplay() {
		System.out.println(this.id+" "+this.name+" "+this.salary);
	}
	
}
public class Demo {

	public static void main(String[] args) {
		ArrayList<Employee> list1=new ArrayList();
		List<Employee> newlist=new ArrayList();
		list1.add(new Employee(101,"satwik",100));
		list1.add(new Employee(102,"ram",1000));
		list1.add(new Employee(103,"sita",2500));
		for(Employee a :list1) {
			a.diplay();
		}
		list1.stream().map(a->a.salary=a.salary*1.1).forEach(a->System.out.println());
		for(Employee a :list1) {
				a.diplay();
		}

	}

}
