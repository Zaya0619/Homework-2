package seleniumNov;

public class Computer {
	 int speed; 
	 String color;
     String brand;
	 static int cost;
	
	public void showMe(){
		System.out.println(speed + " '" + color + " " + brand + " " + cost);
	}
		
	public Computer (int speed, String color, String brand, int cost) {
		this.speed = speed;
		this.color = color;
		this.brand = brand;
		this.cost = cost;
		
	}
}

