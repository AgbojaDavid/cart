import java.util.ArrayList;
import java.util.List;

public class Basket {
	private int basketID;
	private List<Item> items; 

	public Basket(int basketID) {
		this.basketID = basketID;
		this.items = new ArrayList<>();
	}	
	
	public void addItem(String name, double price) {
		Item item = new Item(name, price);
		items.add(item);
	}
	public double totalBasket() {
		double total = 0;
		for (Item item : items) {
			total += item.getPrice();
		}
		return total;
	}
	public String toString() {
		StringBuilder result = new StringBuilder("Basket " + basketID + " has the following items:\n");
		double totalCost = 0;
		
		for (Item item : items) {
			result.append(item.toString()).append("\n");
			totalCost += item.getPrice();
		}
		result.append("Total cost: ").append(String.format("%.2f", totalCost)).append(" pounds\n");
		return result.toString();
	}
}
