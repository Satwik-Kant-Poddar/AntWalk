package Assignment;

public class Tester {

	public static void main(String[] args) {
		ContractEmployee emp1 = new ContractEmployee(101,"vir",50d,20f);
		double a=  emp1.calculateSalary();
		System.out.println(a);
		PermanentEmployee emp2 =new PermanentEmployee(501,"hir",1000d,200d,5.5f);
		a=emp2.calculateMonthlySalary();
		System.out.println(a);
	}

}
