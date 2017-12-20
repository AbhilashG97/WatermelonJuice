
public class Fruit {

	private String fruitName;
	private int price;

	public void displayDetails() {
		System.out.println("Fruit name :-> "+getFruitName()+"\nPrice :-> "+getPrice());
	}
	public String getFruitName() {
		return fruitName;
	}
	public int getPrice() {
		return price;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
