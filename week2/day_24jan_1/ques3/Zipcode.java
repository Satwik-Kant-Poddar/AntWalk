package Day24jan;

public class Zipcode extends Exception{
	public Zipcode(String errorMessage) {  
	    super(errorMessage);  
	    }  
	static void add(City[] arr,int index,String name , int pincode) {
		arr[index]=new City(name , pincode);
	}
	static void find(City[] arr ,String name) throws Exception{
		int flag=0;
		for(int i=0 ; i< arr.length ; i++) {
			if(arr[i].name.equals(name)) {
				flag=1;
				System.out.println("city found "+arr[i].name+" "+arr[i].pincode);
			}
		}
		if(flag==0) {
			throw new  Zipcode("city not found");
		}
	}
	static void find(City[] arr , int pincode) throws Exception{
		int flag=0;
		for(int i=0 ; i< arr.length ; i++) {
			if(arr[i].pincode==pincode) {
				flag=1;
				System.out.println("city found "+arr[i].name+" "+arr[i].pincode);
			}
		}
		if(flag==0) {
			throw new  Zipcode("city not found");
		}
	}
	public static void main(String[] args) throws Exception{
		City[] arr = new City[5];
		add(arr,0,"A",1111);
		add(arr,1,"B",2222);
		add(arr,2,"C",3333);
		add(arr,3,"D",4444);
		add(arr,4,"E",5555);
		for(int i =0 ; i<arr.length; i++) {
			System.out.println(arr[i].name+" "+arr[i].pincode);
		}
		find(arr,"Z");
	}

}
