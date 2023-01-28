package overloading;

public class Truck extends vehicle{
	
	private int no_of_axle;
	private String permit_type;
	public Truck(int a, int b, String c, String d, int no_of_axle, String permit_type) {
		super(a, b, c, d);
		this.no_of_axle = no_of_axle;
		this.permit_type = permit_type;
	}
	public int getNo_of_axle() {
		return no_of_axle;
	}
	public void setNo_of_axle(int no_of_axle) {
		this.no_of_axle = no_of_axle;
	}
	public String getPermit_type() {
		return permit_type;
	}
	public void setPermit_type(String permit_type) {
		this.permit_type = permit_type;
	}
	public void display(){
		super.display();
		System.out.println("no_of_axle: "+no_of_axle);
		System.out.println("permit_type: "+permit_type);
	}

}
