public class Item {
	private String name;
	private double price;

	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		return String.format("Item: %s, price: %.2f pounds", name, price);
	}
}
