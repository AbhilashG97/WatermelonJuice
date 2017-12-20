
public class Fruit {
	
	private String fruitName;
	private int price;
	
	public Fruit(String fruitName, int price) {
		this.fruitName = fruitName;
		this.price = price; 
	}
	
	public Fruit(String fruitName) {
		this.fruitName = fruitName;
	}
	
	public Fruit(int price) {
		this.price = price;
	}
	
	public String getFruitName() {
		return fruitName;
	}
	public int getPrice() {
		return price;
	}
	
	public void displayInformation() {
		System.out.println("Fruit name :-> "+getFruitName()+"\nPrice :-> "+getPrice());
	}
}
