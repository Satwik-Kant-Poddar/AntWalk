package day27;

public class Employee {
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void display(){
		System.out.println("-----x------x-----x----");
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
		System.out.println("-----x------x-----x----");
	}
}
