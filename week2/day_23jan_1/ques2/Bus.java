package overloading;

public class Bus extends vehicle {
	private String agency;

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public Bus(int a, int b, String c, String d, String agency) {
		super(a, b, c, d);
		this.agency = agency;
	}
	public void display(){
		super.display();
		System.out.println("agency: "+agency);
	}

	
}
