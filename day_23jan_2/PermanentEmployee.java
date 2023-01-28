package Assignment;

public class PermanentEmployee extends Employee{
double basicPay;
double hra;
float experience;
public PermanentEmployee(int employeeId, String employeeName/*, double salary*/, double basicPay, double hra,
		float experience) {
	super(employeeId, employeeName, 0);
	this.basicPay = basicPay;
	this.hra = hra;
	this.experience = experience;
}
public double getBasicPay() {
	return basicPay;
}
public void setBasicPay(double basicPay) {
	this.basicPay = basicPay;
}
public double getHra() {
	return hra;
}
public void setHra(double hra) {
	this.hra = hra;
}
public float getExperience() {
	return experience;
}
public void setExperience(float experience) {
	this.experience = experience;
}
double vPay() {
	if(this.experience<3) {
		return this.basicPay*0;
	}else if(this.experience>=3&&this.experience<5){
		return this.basicPay*0.05;
	}else if(this.experience>=5&&this.experience<10){
		return this.basicPay*0.07;
	}else if(this.experience>=10) {
		return this.basicPay*0.12;
	}
	return 0;
}
double calculateMonthlySalary(){
	this.setSalary(basicPay+hra+this.vPay());
	return this.getSalary();
}
}
