package overloading;

public class Road {
	public static void main(String[] args) {
		Car audi = new Car(100,900,"q3","red","suv");
		Bus volvo = new Bus(101,901,"v2400","greeen","ld_motor");
		Truck tata= new Truck(102,903,"prime","black",4,"all india");
		audi.display();
		volvo.display();
		tata.display();
	}

}
