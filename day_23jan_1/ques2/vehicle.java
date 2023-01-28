package overloading;

public class vehicle {
	private int engine_no;
	private int reg_no;
	private String model;
	private String colour;
	vehicle(int a , int b , String c , String d){
		this.engine_no=a;
		this.reg_no=b;
		this.model=c;
		this.colour=d;
	}
	public int getEngine_no() {
		return engine_no;
	}
	public void setEngine_no(int engine_no) {
		this.engine_no = engine_no;
	}
	public int getReg_no() {
		return reg_no;
	}
	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void display() {
		System.out.println("------x-----x-----x------");
		System.out.println("eng_no: "+engine_no);
		System.out.println("reg_no: "+reg_no);
		System.out.println("model: "+model);
		System.out.println("colour: "+colour);
		
	}

}
