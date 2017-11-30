import java.util.ArrayList;
import java.util.List;

public class Shop {
	private String name;
	List<Item> items = new ArrayList<Item>();

	Shop(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void printShop() {
		for(int i = 0; i < items.size(); i++) {
			System.out.print(i + " ");
			items.get(i).printItem();
		}
	}

	Item buyItem(int itemNo) {
		return items.get(itemNo);
	}
}
