package stock;

public class Order {
	Order(){
		
	}
    Order(Laptop a ,int b){
    	if(a.quantity<b) {
    		System.out.println
    		("no of items in order is greater than in inventory");
    	}else {
    		if(a.loworderlevelquantity>a.quantity-b) {
    			System.out.println("order created price: "+(a.price*b)+
    					" company and id: "+a.company+" "+a.id);
    			System.out.println("plz refill the stock of: "+a.company+" "+a.id);
    	}else {
    		System.out.println("order created price: "+(a.price*b) +
    				" company and id: "+a.company+" "+a.id);
    	}
    	}
    }
    Order(Acces a ,int b){
    	if(a.quantity<b) {
    		System.out.println
    		("no of items in order is greater than in inventory");
    	}else {
    		if(a.loworderlevelquantity>a.quantity-b) {
    			System.out.println("order created price: "+(a.price*b)+
    					" company and id: "+a.company+" "+a.id);
    			System.out.println("plz refill the stock of: "+a.company+" "+a.id);
    	}else {
    		System.out.println("order created price: "+(a.price*b) +
    				" company and id: "+a.company+" "+a.id);
    	}
    	}
    }
	public static void main(String[] args) {
		Laptop l1 = new Laptop(101,"dell",10,45000);
		Acces a1 = new Acces(501,"logitech",20,2000);
		Order a = new Order(l1,8);
		Order b = new Order(a1,5);
	}

}
