package overloading;

public class Car extends vehicle{
	private String type;

	public Car(int a, int b, String c, String d, String type) {
		super(a, b, c, d);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void display(){
		super.display();
		System.out.println("type: "+type);
	}

}
