package Assignment;

public class ContractEmployee extends Employee{
	
double wage;
float hoursWorked;

public ContractEmployee(int employeeId, String employeeName/*, double salary*/, double wage, float hoursWorked) {
	
	super(employeeId, employeeName, 0);
	this.wage = wage;
	this.hoursWorked = hoursWorked;
}
public double getWage() {
	return wage;
}
public void setWage(double wage) {
	this.wage = wage;
}
public float getHoursWorked() {
	return hoursWorked;
}
public void setHoursWorked(float hoursWorked) {
	this.hoursWorked = hoursWorked;
}

double calculateSalary(){
	this.setSalary(this.hoursWorked*this.wage);
	return this.getSalary();
	
}

}
