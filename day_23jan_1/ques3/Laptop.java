package stock;

public class Laptop extends Inventory {
int id ; 
 String company;
 int price;
 Laptop(){
	 
 }
 Laptop(int a , String b,int c , int d ){
	this.loworderlevelquantity=3;
	 this.company=b;
	this.id=a;
	this.quantity=c;
	this.price=d;
 }
 
}
