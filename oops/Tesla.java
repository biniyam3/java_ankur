package oops;

public class Tesla {
	
	String model;
	String color;
	long vin;
	double price;
	
	public Tesla(String model, String color, int vin, int price) {
		super();
		this.model = model;
		this.color = color;
		this.vin = vin;
		this.price = price;
	}




	public void printList() {
		System.out.println("model: " + model);
		System.out.println("color: " + color);
		System.out.println("vin number: " + vin);
		System.out.println("price: " + price);
	}


}
