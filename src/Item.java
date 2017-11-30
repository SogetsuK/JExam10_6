public class Item {
	String name;
	int price;
	Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	void printItem() {
			System.out.println(this.name + ":" +this.price + "円");

	}
	int getPrice() {
		return price;
	}
}
