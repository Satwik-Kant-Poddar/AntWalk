package stock;

public class Acces  extends Inventory {
int id;
String company;
int price;
Acces(){
	
}
Acces(int a , String b , int c , int d){
	this.company=b;
	this.id=a;
	this.loworderlevelquantity=5;
	this.quantity=c;
	this.price=d;
}
}
