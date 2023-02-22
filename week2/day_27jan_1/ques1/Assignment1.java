package day27;

import java.util.*;
public class Assignment1 {
	ArrayList<Employee> Emp;
	public Assignment1() {
		this.Emp= new ArrayList<Employee>();
	}
	private void insert(Scanner in) {
		System.out.print("enter id:");
		int id=in.nextInt();
		System.out.print("enter name:");
		String name=in.next();
		System.out.print("enter salary:");
		double salary=in.nextDouble();
		Employee e=new Employee(id,name,salary);
		Emp.add(e);
		System.out.println("done");
	}
	private void display(Scanner in) {
		for(Employee i:Emp) {
			i.display();
		}
	}
	private void search(Scanner in) {
		int id=in.nextInt();
		for(Employee i:Emp) {
			if(i.getId()==id) {
				i.display();
				return;
			}
		}
		System.out.println("Not Found");
	}
	private void delete(Scanner in) {
		int id=in.nextInt();
		for(Employee i:Emp) {
			if(i.getId()==id) {
				Emp.remove(i);
				System.out.println("Deleted");
				return;
			}
		}
		System.out.println("Not Found");
	}
	private void update(Scanner in) {
		int id=in.nextInt();
		for(Employee i:Emp) {
			if(i.getId()==id) {
				System.out.print("Name:");
				String name=in.next();
				System.out.print("Salary:");
				double salary=in.nextDouble();
				i.setName(name);
				i.setSalary(salary);
				System.out.println("Updated Successfully");
			}
		}
		System.out.println("Not Found");
	}
	private void menu() {
		Scanner in = new Scanner(System.in);
		while (true) {
			int choice = -1;
			System.out.println("1. Insert\n2.Display\n3.Search\n4.Delete\n5.Update\n6.Exit");
			System.out.print("Enter Your Choice: ");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				insert(in);
				break;
			case 2:
				display(in);
				break;
			case 3:
				search(in);
				break;
			case 4:
				delete(in);
				break;
			case 5:
				update(in);
				break;
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid Choice!!");
				break;
			}
			if (choice == 6)
				break;
		}
	}
	public static void main(String[] args) {
		Assignment1 a=new Assignment1();
		a.menu();
	}
}
